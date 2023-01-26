# Tuples - it is a collection of elements which is not changing
# it has ordered elements and is similar to lists
# we can modify lists but we can not modify tuples
# it is written under small brackets
num = (10,30,9)
print(type(num))

# it can not be modified
#num[1] = 25

print(num.count(30))
print(num.index(10))

# tuple unpacking
details = [("sam", 20), ("pam", 34), ("tim", 56)]
for emp in details:
    print(emp)

for name, age in details:
    print(f" name is {name} and age is {age}")

