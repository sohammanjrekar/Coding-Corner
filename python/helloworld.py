# print("the vlaue is {} and {}".format(25,98))
# print("geeks:%5d" % (10))
# list1=list(range(1,5))
# print(list1)
# list1.append(25)
# print(list1)
# list1.extend(list(range(5,8)))
# print(list1)
# list1.insert(1,4500)
# print(list1)
# print(type(list1))
# str1="abcdefghijklmnopqrstuvwxyz"
# print(str1[0:26:2])
# str1="harry"
# print(str1[1:4])
# print(str1[-4:-1])
# print('a' in str1)
# print('a' not in str1)
# name="soham"
# print(f'{name} in list')

# def square(a):
#     '''
#     takes a square
#     '''
#     return a*a

# with open("output.txt","w")as f:
#     print("soham is boss",file=f)

# print(square(5))
# print(square.__doc__)

# if 20>15:
#     print("20 is greater than 15")
# elif 20>50:
#     print("50 is greater than 50")
# else:
#     print("20 is not greater than 50")


# for i in range(1,11,2):
#     print(i)
# else:
#     print("loop completed")

def custom_sum(*n):
    return sum(n)  # Uses the built-in sum function

print(custom_sum(1, 2, 3, 4, 5))  # Output: 15
print(custom_sum(1, 2))           # Output: 3
