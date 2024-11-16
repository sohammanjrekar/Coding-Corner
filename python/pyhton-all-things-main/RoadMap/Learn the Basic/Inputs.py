# Prompting the user to enter a number and storing it in variable 'a'
a = int(input("Enter the number: "))

# Printing the entered number back to the user
print("You entered:", a)

'''The input() function always returns a string, even if the user enters a number or any other type of input. Therefore, if you expect the input to be of a different type, you need to explicitly convert it using functions like int(), float(), etc.'''