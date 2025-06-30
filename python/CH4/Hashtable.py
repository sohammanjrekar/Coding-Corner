# Hash Table
class HashTable:
    def __init__(self):
        self.table = {}

    def insert(self, key, value):
        self.table[key] = value

    def delete(self, key):
        if key in self.table:
            del self.table[key]

    def search(self, key):
        return self.table.get(key, None)

    def display(self):
        for key, value in self.table.items():
            print(f"Key: {key}, Value: {value}")

# Example usage
if __name__ == "__main__":
    ht = HashTable()
    ht.insert("name", "Alice")
    ht.insert("age", 30)
    ht.insert("city", "New York")
    ht.display()
    print("Search for 'age':", ht.search("age"))
    ht.delete("city")
    ht.display()

# using Dictionary as a Hash Table
# A dictionary in Python is a built-in data structure that implements a hash table.
# It allows you to store key-value pairs, where each key is unique and maps to a specific value.
# Example of using a dictionary as a hash table
ht_dict = {
    "name": "Alice",
    "age": 30,
    "city": "New York"
}
# Inserting a new key-value pair
ht_dict["country"] = "USA"  
# Searching for a value by key
age = ht_dict.get("age")  # Returns 30
# Deleting a key-value pair
del ht_dict["city"]  # Removes the key "city"
# Displaying the hash table
for key, value in ht_dict.items():
    print(f"Key: {key}, Value: {value}")
# This code defines a simple hash table implementation using a dictionary in Python.
# It allows you to insert, delete, search, and display key-value pairs.
