# Hashing is a technique used to map data of arbitrary size to fixed-size values,
# commonly used in data structures like hash tables.

def hash_function(key, table_size):
    return key % table_size

class HashTable:
    def __init__(self, size):
        self.size = size
        self.table = [[] for _ in range(size)]  # Create empty buckets

    def insert(self, key):
        index = hash_function(key, self.size)
        if key not in self.table[index]:  # Avoid duplicates
            self.table[index].append(key)

    def search(self, key):
        index = hash_function(key, self.size)
        return key in self.table[index]

    def delete(self, key):
        index = hash_function(key, self.size)
        if key in self.table[index]:
            self.table[index].remove(key)

    def display(self):
        print("\n📦 Hash Table Contents:")
        for i, bucket in enumerate(self.table):
            print(f"Bucket {i}: {bucket}")

# Example usage
if __name__ == "__main__":
    hash_table = HashTable(size=4)

    # Insert values
    for value in [5, 15, 25, 35, 45, 55, 65]:
        hash_table.insert(value)

    hash_table.display()

    # Search
    print("\n🔍 Search for 15:", "Found" if hash_table.search(15) else "Not Found")

    # Delete
    print("🗑️ Deleting 15...")
    hash_table.delete(15)

    print("🔍 Search for 15:", "Found" if hash_table.search(15) else "Not Found")

    # Final table
    hash_table.display()
    print("📦 Final Hash Table:"
          "\n", hash_table.table)
    print("Hash Table Size:", hash_table.size)
    print("Hash Table Buckets:", len(hash_table.table))
    print("Hash Table Load Factor:", sum(len(bucket) for bucket in hash_table.table) / hash_table.size)
    print("Hash Table Empty Buckets:", sum(1 for bucket in hash_table.table if not bucket))
    print("Hash Table Non-Empty Buckets:", sum(1 for bucket in hash_table.table if bucket))
    print("Hash Table Collisions:", sum(len(bucket) > 1 for bucket in hash_table.table))
    print("Hash Table Average Bucket Size:", sum(len(bucket) for bucket in hash_table.table) / len(hash_table.table) if hash_table.table else 0)
    print("Hash Table Maximum Bucket Size:", max(len(bucket) for bucket in hash_table.table) if hash_table.table else 0)
    print("Hash Table Minimum Bucket Size:", min(len(bucket) for bucket in hash_table.table) if hash_table.table else 0)
    print("Hash Table Keys:", [key for bucket in hash_table.table for key in bucket])
    print("Hash Table Values:", [bucket for bucket in hash_table.table])        