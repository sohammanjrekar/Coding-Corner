import random

random_number = random.randint(1, 100)
print("Random number generated:", random_number)

print(random.randrange(1, 100))  # Generates a random number between 1 and 100
print(random.uniform(1, 100))  # Generates a random float between 1 and 100
print(random.choice(['apple', 'banana', 'cherry']))  # Randomly selects an item from the list
print(random.sample([1, 2, 3, 4, 5], 3))  # Randomly selects 3 unique items from the list   
print(random.shuffle([1, 2, 3, 4, 5]))  # Shuffles the list in place
print(random.random())  # Generates a random float between 0.0 and 1.0
print(random.getrandbits(5))  # Generates a random integer with 5 bits
print(random.seed(42))  # Sets the seed for reproducibility
print("Random number with seed 42:", random.randint(1, 100))  # Generates a random number with the seed set