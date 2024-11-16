# # Import the Flask class from the flask library
# from flask import Flask

# # Create an instance of the Flask class and assign it to the variable `app`.
# # `__name__` is a special variable in Python that represents the name of the current module.
# # It helps Flask to locate resources (like templates and static files) in this module.
# app = Flask(__name__)

# # Define a route for the root URL ('/').
# # This decorator `@app.route('/')` tells Flask that the following function will handle requests to this URL.
# @app.route('/')
# def index():
#     # This function, `index`, is the view function for the '/' route.
#     # It returns the string "hello world" as a response to any requests to the root URL.
#     return "hello world"

# # This block ensures that the app runs only when the script is executed directly.
# # `__name__ == '__main__'` checks if the script is being run directly or imported as a module.
# if __name__ == '__main__':
#     # Start the Flask application.
#     # `host='0.0.0.0'` makes the server externally visible, allowing access from other devices on the network.
#     # `port=5555` specifies the port number to run the app (default is 5000).
#     # `debug=True` enables debug mode, providing helpful error messages and auto-reloading when code changes.
#     app.run(host='0.0.0.0', port=5555, debug=True)

# Import the necessary modules from Flask and other libraries.
from flask import Flask, render_template, request, redirect, url_for, flash, jsonify, session, abort
from flask_sqlalchemy import SQLAlchemy  # For database interaction
from flask_login import LoginManager, UserMixin, login_user, login_required, logout_user, current_user
from werkzeug.security import generate_password_hash, check_password_hash  # For password hashing
from flask_mail import Mail, Message  # For sending emails
from datetime import datetime  # For handling date and time
import os  # For accessing environment variables and file paths

# Initialize the Flask application instance
app = Flask(__name__)

# Application configuration settings
app.config['SECRET_KEY'] = '1234'  # Secret key for session management, CSRF protection, etc.
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///app.db'  # SQLite database configuration
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False  # Disable modification tracking
app.config['MAIL_SERVER'] = 'smtp.gmail.com'  # Set the mail server for sending emails
app.config['MAIL_PORT'] = 587  # Port for the mail server
app.config['MAIL_USE_TLS'] = True  # Use TLS for security
app.config['MAIL_USERNAME'] = 'mrsohammanjrekar@gmail.com'  # Email username for the mail server
app.config['MAIL_PASSWORD'] = 'trkzxeznegor xqws'  # Password for the email account

# Initialize the SQLAlchemy database instance
db = SQLAlchemy(app)

# Initialize Flask-Mail for email functionality
mail = Mail(app)

# Setup Flask-Login for user session management
login_manager = LoginManager()
login_manager.init_app(app)  # Initialize the login manager with the app
login_manager.login_view = 'login'  # Redirect to 'login' if user is not authenticated

# Define the User model for database (User authentication details)
class User(UserMixin, db.Model):
    id = db.Column(db.Integer, primary_key=True)  # Unique identifier for each user
    username = db.Column(db.String(150), unique=True, nullable=False)  # Username field
    email = db.Column(db.String(150), unique=True, nullable=False)  # Email field
    password_hash = db.Column(db.String(256), nullable=False)  # Hashed password
    created_at = db.Column(db.DateTime, default=datetime.utcnow)  # Timestamp for user creation

    # Method to set the user's password (hashes it)
    def set_password(self, password):
        self.password_hash = generate_password_hash(password)

    # Method to check if the provided password matches the stored hash
    def check_password(self, password):
        return check_password_hash(self.password_hash, password)

# Function to create the database tables
def create_tables():
    db.create_all()  # Creates all the database tables defined in the models

# Login manager user loader function to load user based on session ID
@login_manager.user_loader
def load_user(user_id):
    return User.query.get(int(user_id))  # Returns the user object based on user ID

# Route for the homepage
@app.route('/')
def index():
    return render_template('index.html')  # Renders the index.html template

# User registration route
@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':  # Check if the request method is POST
        username = request.form['username']  # Get username from form
        email = request.form['email']  # Get email from form
        password = request.form['password']  # Get password from form

        # Check if the user already exists in the database
        if User.query.filter_by(email=email).first():
            flash('Email is already registered!')  # Flash message if email is taken
            return redirect(url_for('register'))  # Redirect to the registration page

        # Create a new user object
        new_user = User(username=username, email=email)
        new_user.set_password(password)  # Set the hashed password
        db.session.add(new_user)  # Add the new user to the session
        db.session.commit()  # Commit the session to save the user to the database
        flash('Registration successful! Please log in.')  # Flash success message
        return redirect(url_for('login'))  # Redirect to the login page

    return render_template('register.html')  # Render the registration form

# User login route
@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':  # Check if the request method is POST
        email = request.form['email']  # Get email from form
        password = request.form['password']  # Get password from form
        user = User.query.filter_by(email=email).first()  # Find user by email
        
        # Validate user credentials
        if user and user.check_password(password):  # Check if user exists and password is correct
            login_user(user)  # Log in the user
            flash('Logged in successfully!')  # Flash success message
            return redirect(url_for('dashboard'))  # Redirect to the dashboard
        else:
            flash('Invalid email or password.')  # Flash error message for invalid credentials

    return render_template('login.html')  # Render the login form

# Protected route (requires user to be logged in)
@app.route('/dashboard')
@login_required  # Ensure that user is logged in
def dashboard():
    return render_template('dashboard.html', user=current_user)  # Render dashboard with current user info

# User logout route
@app.route('/logout')
@login_required  # Ensure that user is logged in
def logout():
    logout_user()  # Log out the user
    flash('You have been logged out.')  # Flash logout message
    return redirect(url_for('index'))  # Redirect to the homepage

# Contact form route with email functionality
@app.route('/contact', methods=['GET', 'POST'])
def contact():
    if request.method == 'POST':  # Check if the request method is POST
        email = request.form['email']  # Get sender's email from form
        subject = request.form['subject']  # Get subject from form
        message = request.form['message']  # Get message content from form

        # Create and send email using Flask-Mail
        msg = Message(subject, sender=email, recipients=['mrsohammanjrekar@gmail.com'])
        msg.body = message  # Set the body of the email
        mail.send(msg)  # Send the email
        flash('Message sent successfully!')  # Flash success message
        return redirect(url_for('index'))  # Redirect to the homepage
    
    return render_template('contact.html')  # Render the contact form

# API route to fetch user information in JSON format
@app.route('/api/users', methods=['GET'])
def api_users():
    users = User.query.all()  # Retrieve all users from the database
    return jsonify([{'id': user.id, 'username': user.username, 'email': user.email} for user in users])  # Return user data as JSON

# API route to fetch specific user details by user ID
@app.route('/api/users/<int:user_id>', methods=['GET'])
def api_user(user_id):
    user = User.query.get_or_404(user_id)  # Retrieve user by ID or return 404 if not found
    return jsonify({'id': user.id, 'username': user.username, 'email': user.email})  # Return user data as JSON

# Error handler for 404 errors (page not found)
@app.errorhandler(404)
def page_not_found(error):
    return render_template('404.html'), 404  # Render custom 404 page

# Error handler for 500 errors (internal server error)
@app.errorhandler(500)
def internal_server_error(error):
    return render_template('500.html'), 500  # Render custom 500 page

# Run the application
if __name__ == '__main__':
    with app.app_context():  # Create an application context
        create_tables()  # Create all database tables defined in models
    app.run(debug=True)  # Run the app with debug mode enabled
