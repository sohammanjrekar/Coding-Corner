mydict = {
    "name": "Alice",
    "age": 30,
    "city": "New York"
}
# create a dictionary
print(mydict)
# access elements
print(mydict["name"])  # Accessing value by key
print(mydict["age"])
print(mydict["city"])
# add elements
mydict["country"] = "USA"  # Adding a new key-value pair
print(mydict)
# update elements
mydict["age"] = 31  # Updating an existing key-value pair
print(mydict)
# remove elements
del mydict["city"]  # Removing a key-value pair
print(mydict)
# check if key exists
print("name" in mydict)  # Checking if a key exists
print("city" in mydict)  # Checking for a key that has been removed
# iterate over keys
for key in mydict:
    print(key)
# iterate over values
for value in mydict.values():
    print(value)
# iterate over key-value pairs
for key, value in mydict.items():
    print(f"{key}: {value}")
    