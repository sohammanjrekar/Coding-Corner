# #using while loop with else
# pin=1234
# c=0
# while c<3:
#     pin2=int(input("enter pin"))
#     c+=1
#     if pin==pin2:
#         print("transaction successful")
#         break
#     else:
#         print("transaction failed")
# else:
#     print("card blocked")


# Using a for loop with else to handle PIN verification

# Correct PIN
pin = 1234

# Maximum number of attempts
max_attempts = 3

# Loop for PIN verification
for attempts in range(max_attempts):
    entered_pin = int(input("Enter PIN: "))
    
    if entered_pin == pin:
        print("Transaction successful")
        break  # Exit the loop if the PIN is correct
    else:
        print("Incorrect PIN. Please try again.")

# If the loop completes without a correct PIN, the 'else' block is executed
else:
    print("Card blocked")
