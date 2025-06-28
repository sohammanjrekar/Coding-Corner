myset = set([1, 2, 3, 4, 5])
print(type(myset))
print(myset)

myset2 = set("hello")
print(type(myset2))
print(myset2)

myset3 = set(range(10))
print(type(myset3))
print(myset3)

# using tuples instead of sets for nesting
myset4 = set([("a", "b"), ("c", "d")])
print(type(myset4))
print(myset4)

# adding elements
myset.add(6)
print(myset)

# removing elements
myset.remove(2)  # KeyError if not found
print(myset)

# discard (optional)
myset.discard(3)
print(myset)

# clearing the set
myset.clear()
print(myset)

# membership
print(1 in myset)
print(6 in myset)

# set operations
set1 = {1, 2, 3}
set2 = {3, 4, 5}
print(set1 | set2)  # union
print(set1 & set2)  # intersection
print(set1 - set2)  # difference
print(set1 ^ set2)  # symmetric difference
