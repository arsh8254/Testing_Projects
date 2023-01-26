# String methods
x = "welcome"
x = x.upper()

# changes all lower case into upper cases
print(x.upper())
print(x)

# to convert into a list of elemnts
x = "welcome to moolya"
print(x.split())

# to remove a particular letter from sentence
print(x.split("o"))

# to seperate date and time
date = "240522T23:04:22"
time = date.split("T")
print(time[1])