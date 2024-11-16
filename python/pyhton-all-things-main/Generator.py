# Define a generator function named 'genrate' which takes one argument 'n'
def genrate(n):
    # Initialize a variable 'val' with 0
    val = 0
    # Create a while loop that will run as long as 'val' is less than 'n'
    while val < n:
        # Yield the current value of 'val' to the caller, pausing the function's execution
        yield val
        # Increment 'val' by 1 to proceed to the next value in the next iteration
        val += 2

# Iterate over the values produced by the generator function 'genrate' with 'n' set to 3
for val in genrate(3):
    # Print the current value produced by the generator
    print(val)


# The yield keyword is used to produce a value from the generator function. When yield is encountered, the function's state is saved, and the value of val is returned to the caller. The function can then resume execution where it left off on subsequent calls.