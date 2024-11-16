# Printing numbers from 3 to 5
print("List 1")
for num in range(3, 6):
    print(num)

# Printing elements of the list
print("List 2")
colors = [1, "j", 45, True]
for item in colors:
    print(item)

# Printing numbers from 1 to 2 using a while loop
print("List 3")
counter = 1
while counter < 3:
    print(counter)
    counter += 1




# Printing numbers from 1 to 2 using a do-while loop emulation
print("List 4")
p = 1
while True:
    p += 1
    print(p)
    if p >= 2:
        break

# Emulating a goto-like behavior using continue and break
for i in range(5):
    print("Outer loop:", i)
    for j in range(3):
        print("Inner loop:", j)
        if i == 2 and j == 1:
            print("Jumping out of the inner loop")
            break  # Exiting the inner loop
    else:
        continue  # Skipping the rest of the outer loop body if the inner loop didn't break
    break  # Exiting the outer loop

