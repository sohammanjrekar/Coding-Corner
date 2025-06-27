# Operators in Python
#1. Arithmetic Operators : Arithmetic operators in Python are used to perform mathematical operations.
# These operators include addition (+), subtraction (-), multiplication (*), division (/), modulus (%), exponentiation (**), and floor division (//).
# Example:
a = 10          
b = 3
# Addition
addition = a + b  # 13
# Subtraction
subtraction = a - b  # 7
# Multiplication

multiplication = a * b  # 30
# Division
division = a / b  # 3.3333333333333335
# Modulus
modulus = a % b  # 1
# Exponentiation
exponentiation = a ** b  # 1000
# Floor Division
floor_division = a // b  # 3
# Output the results
print("Arithmetic Operators:")  
print(f"Addition: {addition}")
print(f"Subtraction: {subtraction}")    
print(f"Multiplication: {multiplication}")
print(f"Division: {division}")
print(f"Modulus: {modulus}")
print(f"Exponentiation: {exponentiation}")
print(f"Floor Division: {floor_division}")
#2. Comparison Operators : Comparison operators in Python are used to compare two values.
# These operators include equal to (==), not equal to (!=), greater than (>), less than (<), greater than or equal to (>=), and less than or equal to (<=).
# Example:
comparison_a = 10   
comparison_b = 20
# Equal to
equal_to = comparison_a == comparison_b  # False
# Not equal to
not_equal_to = comparison_a != comparison_b  # True
# Greater than      
greater_than = comparison_a > comparison_b  # False
# Less than
less_than = comparison_a < comparison_b  # True
# Greater than or equal to
greater_than_or_equal_to = comparison_a >= comparison_b  # False
# Less than or equal to
less_than_or_equal_to = comparison_a <= comparison_b  # True
# Output the results
print("\nComparison Operators:")
print(f"Equal to: {equal_to}")
print(f"Not equal to: {not_equal_to}")
print(f"Greater than: {greater_than}")
print(f"Less than: {less_than}")
print(f"Greater than or equal to: {greater_than_or_equal_to}")
print(f"Less than or equal to: {less_than_or_equal_to}")
#3. Logical Operators : Logical operators in Python are used to combine conditional statements.
# These operators include and, or, and not.
# Example:
logical_a = True
logical_b = False
# Logical AND
logical_and = logical_a and logical_b  # False
# Logical OR
logical_or = logical_a or logical_b  # True         
# Logical NOT
logical_not = not logical_a  # False
# Output the results
print("\nLogical Operators:")       
print(f"Logical AND: {logical_and}")    
print(f"Logical OR: {logical_or}")
print(f"Logical NOT: {logical_not}")
#4. Assignment Operators : Assignment operators in Python are used to assign values to variables.
# These operators include simple assignment (=), addition assignment (+=), subtraction assignment (-=), multiplication assignment (*=), division assignment (/=), modulus assignment (%=), exponentiation assignment (**=), and floor division assignment (//=).
# Example:
assignment_a = 10
assignment_b = 5
# Simple assignment
assignment_simple = assignment_a  # 10
# Addition assignment
assignment_simple += assignment_b  # 15
# Subtraction assignment
assignment_simple -= assignment_b  # 10
# Multiplication assignment
assignment_simple *= assignment_b  # 50
# Division assignment
assignment_simple /= assignment_b  # 10.0
# Modulus assignment

assignment_simple %= assignment_b  # 0.0
# Exponentiation assignment
assignment_simple **= assignment_b  # 0.0
# Floor division assignment
assignment_simple //= assignment_b  # 0.0
# Output the results
print("\nAssignment Operators:")
print(f"Simple Assignment: {assignment_simple}")
print(f"Addition Assignment: {assignment_simple + assignment_b}")  # 5.0
print(f"Subtraction Assignment: {assignment_simple - assignment_b}")  # -5.0
print(f"Multiplication Assignment: {assignment_simple * assignment_b}")  # 0.0
print(f"Division Assignment: {assignment_simple / assignment_b}")  # 0.0
print(f"Modulus Assignment: {assignment_simple % assignment_b}")  # 0.0
print(f"Exponentiation Assignment: {assignment_simple ** assignment_b}")  # 0.0
print(f"Floor Division Assignment: {assignment_simple // assignment_b}")  # 0.0
#5. Bitwise Operators : Bitwise operators in Python are used to perform bit-level operations on integers.
# These operators include bitwise AND (&), bitwise OR (|), bitwise XOR (^), bitwise NOT (~), left shift (<<), and right shift (>>).
# Example:
bitwise_a = 10  # 1010 in binary
bitwise_b = 4   # 0100 in binary
# Bitwise AND
bitwise_and = bitwise_a & bitwise_b  # 0
# Bitwise OR
bitwise_or = bitwise_a | bitwise_b  # 14
# Bitwise XOR
bitwise_xor = bitwise_a ^ bitwise_b  # 14
# Bitwise NOT
bitwise_not = ~bitwise_a  # -11
# Left shift
bitwise_left_shift = bitwise_a << 2  # 40 (101000 in binary)
# Right shift
bitwise_right_shift = bitwise_a >> 2  # 2 (0010 in binary)
# Output the results
print("\nBitwise Operators:")   
print(f"Bitwise AND: {bitwise_and}")
print(f"Bitwise OR: {bitwise_or}")
print(f"Bitwise XOR: {bitwise_xor}")
print(f"Bitwise NOT: {bitwise_not}")
print(f"Left Shift: {bitwise_left_shift}")
print(f"Right Shift: {bitwise_right_shift}")
#6. Membership Operators : Membership operators in Python are used to test whether a value is a member of a sequence (like a list, tuple, or string).
# These operators include in and not in.
# Example:
membership_list = [1, 2, 3, 4, 5]
membership_value = 3
# In
membership_in = membership_value in membership_list  # True
# Not in
membership_not_in = membership_value not in membership_list  # False
# Output the results
print("\nMembership Operators:")
print(f"In: {membership_in}")
print(f"Not In: {membership_not_in}")
#7. Identity Operators : Identity operators in Python are used to compare the memory locations of two objects.
# These operators include is and is not.
identity_a = [1, 2, 3]
identity_b = [1, 2, 3]
# Is
identity_is = identity_a is identity_b  # False
# Is not
identity_is_not = identity_a is not identity_b  # True
# Output the results
print("\nIdentity Operators:")
print(f"Is: {identity_is}")
print(f"Is Not: {identity_is_not}")
#8. Ternary Operator : The ternary operator in Python is a shorthand way to write an if-else statement.
# It allows you to assign a value based on a condition in a single line.
ternary_condition = True
ternary_value = "Condition is True" if ternary_condition else "Condition is False"
# Output the result
print("\nTernary Operator:")
print(f"Value: {ternary_value}")
#9. Operator Precedence : Operator precedence determines the order in which operators are evaluated in an expression.
# In Python, operators with higher precedence are evaluated before operators with lower precedence.
# Example:
precedence_a = 10   
precedence_b = 5
precedence_c = 2
# Expression with mixed operators
precedence_expression = precedence_a + precedence_b * precedence_c  # 20
# Output the result
print("\nOperator Precedence:")
print(f"Expression: {precedence_expression}")
