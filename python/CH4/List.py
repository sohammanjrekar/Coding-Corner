mylist=[1,2,3,4]
print(type(mylist))
print(mylist)

mylist11=list((1,2,3,4))
print(type(mylist11))
print(mylist11)

mylist3=list("hello")
print(type(mylist3))
print(mylist3)

mylist4=list(range(10))
print(type(mylist4))    
print(mylist4)

# nested list
mylist5=[[1,2,3],[4,5,6]]
print(type(mylist5))
print(mylist5)
# indexing
print(mylist5[0])
print(mylist5[1][2])  # Accessing element 6 in the nested list
# slicing
print(mylist5[0:2])  # Slicing the outer list
