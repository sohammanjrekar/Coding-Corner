i = int(input("Enter the age: "))
print("Yes" if i > 18 else "No")  # in pyhton ternary operator not supported
# Taking input from the user and checking if the age is greater than 18 using a conditional expression
i = int(input("Enter the age: "))
print("Yes" if i > 18 else "No")  

# Using if, elif, and else statements
if i > 18:
    print("Age is greater than 18")
elif i == 18:
    print("Age is exactly 18")
else:
    print("Age is less than 18")

# Using logical operators (and, or, not) in conditions
x = 10
y = 20
z = 30

# Using 'and' to check if all conditions are True
if x < y and y < z:
    print("x is less than y and y is less than z")

# Using 'or' to check if at least one condition is True
if x > y or y < z:
    print("Either x is greater than y or y is less than z")

# Using 'not' to reverse the result of a condition
if not (x > y):
    print("x is not greater than y")



# Match case
x=int(input("Enter in number : "))
match x:
    case 2:
        print("print : ",2)
    case 1:
        print("print : ",1)
    case 3:
        print("print : ",3)
    case 4:
        print("print : ",4)
    case _ if x!=90:
        print("print : ",90)
    case _:
        # defult case
        print("print : ",x)