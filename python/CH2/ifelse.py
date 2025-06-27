num=15
if num > 10:
    print("The number is greater than 10")
elif num == 10:
    print("The number is equal to 10")
else:
    print("The number is less than 10")

# ternary operator
age ="Age is: 18" if num >= 18 else "Age is less than 18"
print(age)

# nested if-else
if num > 10:
    if num % 2 == 0:
        print("The number is greater than 10 and even")
    else:
        print("The number is greater than 10 and odd")


# ternary operator with multiple conditions
age = "Adult" if num >= 18 else "Minor" if num >= 13 else "Child"
print("Age category:", age) 

# switch-case equivalent in Python using dictionary
switch = {
    1: "One",
    2: "Two",
    3: "Three"
}
print("Switch case result:", switch.get(num, "Invalid number"))
# using match-case (Python 3.10+)
# match-case is a new feature in Python 3.10 that provides a more powerful way to handle multiple conditions.
match num:
    case 1:
        print("Matched case 1")
    case 2:
        print("Matched case 2")
    case 3:
        print("Matched case 3")
    case _:
        print("No match found")

