import sqlite3

# Connect to a SQLite database file named 'example.db'
# If the file does not exist, it will be created automatically
connection = sqlite3.connect('example.db')

# Create a cursor object to interact with the database
cursor = connection.cursor()

# Create a new table named 'users' if it doesn't already exist
# The table will have three columns: id (integer, primary key), name (text), and age (integer)
cursor.execute('''
CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY,
    name TEXT,
    age INTEGER
)
''')

# Insert a new record into the 'users' table with the name 'Alice' and age 25
# The values to be inserted are provided as a tuple (name, age)
cursor.execute('''
INSERT INTO users (name, age)
VALUES (?, ?)
''', ('Alice', 25))

# Commit the current transaction to save the changes to the database
connection.commit()

# Execute a query to retrieve all records from the 'users' table
cursor.execute('SELECT * FROM users')

# Fetch all the rows returned by the query and store them in the 'rows' variable
rows = cursor.fetchall()

# Loop through each row in the 'rows' list and print the contents
for row in rows:
    print(row)

# Close the database connection to free up resources
connection.close()
