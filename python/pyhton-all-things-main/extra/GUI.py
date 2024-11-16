import turtle

# Function to draw a square
def draw_square():
    for _ in range(4):
        turtle.forward(100)
        turtle.right(90)

# Function to draw a circle
def draw_circle():
    turtle.circle(50)

# Function to draw a triangle
def draw_triangle():
    for _ in range(3):
        turtle.forward(100)
        turtle.left(120)

# Initialize the turtle screen
screen = turtle.Screen()
screen.title("Turtle GUI")

# Create turtle instance
t = turtle.Turtle()

# Register shape for turtle
screen.register_shape("square", ((-50, -50), (-50, 50), (50, 50), (50, -50)))

# Set the turtle shape
t.shape("square")

# Set up event listeners
screen.onkey(draw_square, "s")
screen.onkey(draw_circle, "c")
screen.onkey(draw_triangle, "t")

# Listen to the events
screen.listen()

# Keep the window open
screen.mainloop()
