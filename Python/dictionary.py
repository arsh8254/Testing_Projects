# dict- it stores key and value pairs
# ordered started after python version 3.7
#unordered before python 3.7
# it is stored with curly brackets

dict_syntax = {"key1": "value1", "key2": "value2", "key3": "value3"}
# example
students = {"name": "sam", "age": "20", "grade": "pass"}
print(students)

# to print individual value
print(students["age"])

# difference between list and dict
#dict
student2 = {"name": "sam", "age": "20", "grade": "pass"}
print(student2["age"])

#list
student1 = ["sam", "20", 1000, ["pass","fail"]]
print(student1[2])

# we can also add entries into the dict
student2["manager"] = "shyam"
print(student2)

#various methods of dict available
print(student2.keys())
print(student2.values())
print(student2.items())


