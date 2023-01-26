# list - these are ordered sequence of elements or objects
# these are written inside big brackets
# these are used to store multiple elements
# lists are mutable and can be changed anytime
subjects = ["maths", "science", "history"]
subjects[1] = "geography"
print(subjects)

#indexing and slicing
print(subjects[2])

# to reverse the order and print it
print(subjects[::-1])

subjects.append("chemistry")
subjects.append("physics")
subjects.insert(3, "english")
subjects.remove("english")
subjects.pop()
subjects.pop()
print(subjects)

subjects.sort()
print(subjects)

marks = [50,20,10,60]
marks.reverse()
marks.sort()
print(marks)
