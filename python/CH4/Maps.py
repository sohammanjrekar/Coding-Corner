# Maps (Dictionaries)
myMap = {
    "name": "Alice",
    "age": 30,
    "city": "New York"
}
# Accessing elements
print(myMap["name"])  # Output: Alice
print(myMap["age"])   # Output: 30
# Adding elements
myMap["email"] = "alice@example.com"
print(myMap)
# Inserting elements
myMap["age"] = 31  # Updating an existing key
print(myMap)
# Removing elements
del myMap["city"]
print(myMap)
# Checking membership
print("name" in myMap)  # Checking if "name" is a key
print("city" in myMap)  # Checking if "city" is a key
# Iterating through the map
for key, value in myMap.items():
    print(key, ":", value)