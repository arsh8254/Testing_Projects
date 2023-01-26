# loops are similar to java but only syntax is changed
# python does not support do while loops

a = 10
b = 20

# colon marks the beginning of loop
if a==b:
    print("a is equal to b")
elif a>b:
    print("a is greater than b")
elif a<b:
    print("a is smaller than b")
else:
    print("a and b are not equal")

# for loop - it is used to iterate over objects
numbers = [10,40,50,20]

for num in numbers:
    print(num)

for number in range(0,11):
    print("hello")

# to print the sum of lists
marks = [92,58,93]
sum = 0
for mark in marks:
    sum = sum +mark

print(sum)

# to deal with strings
name = "john smith"
for char in name[:8]:
    print(char)

dict_emp = {"name": "sam", "age": "20"}
for emp in dict_emp.items():
    print(emp)

# different ways of writing
for name,age in dict_emp.items():
    print(f"{name}: {age}")

if (name == "sam"):
    print("increment")

else:
    print("no increment")


# while loop
x = 0

while(x < 10):
    print(x)
    x = x + 1

else:
    print("failure")
