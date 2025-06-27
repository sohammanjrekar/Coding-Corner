# for loops
for i in range(10):
    print("Iteration:", i)

numbers = [1, 2, 3, 4, 5]
for i in numbers:
    print("Number:", i)

# else for loop
for i in range(5):
    print("Iteration:", i)
    #error
    if i == 3:
        print("Breaking at 3")
        break
else:
    print("Loop completed without break")

# while loops
count = 0
while count < 5:
    print("Count:", count)
    count += 1

# break and continue
for i in range(10):
    if i == 5:
        print("Breaking at 5")
        break
    print("Number:", i)
for i in range(10):
    if i % 2 == 0:
        print("Skipping even number:", i)
        continue
    print("Odd number:", i)