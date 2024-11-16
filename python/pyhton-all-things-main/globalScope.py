def soham():
    global l  # Declare l as a global variable
    l = 5     # Assign a value to the global variable
    print("hii")

def raj():
    print(l)  # Access the global variable l

soham()  # Call the soham function to initialize l
raj()    # Call the raj function to print the value of l
