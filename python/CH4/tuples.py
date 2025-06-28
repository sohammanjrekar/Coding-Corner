mytuple=(1, 2, 3)
print(type(mytuple))
print(mytuple)
mytuple2 = tuple([1, 2, 3, 4])
print(type(mytuple2))
print(mytuple2)
mytuple3 = tuple("hello")
print(type(mytuple3))
print(mytuple3)
mytuple4 = tuple(range(10))
print(type(mytuple4))
print(mytuple4)
# nested tuple
mytuple5 = ((1, 2, 3), (4, 5, 6))
print(type(mytuple5))
print(mytuple5)
# indexing  
print(mytuple5[0])  # Accessing the first nested tuple
print(mytuple5[1][2])  # Accessing element 6 in the
# second nested tuple
# slicing
print(mytuple5[0:2])  # Accessing the first two elements