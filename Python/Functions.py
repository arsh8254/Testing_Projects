# def is the keyword that define the function in python
# functions must be defined with indendations- they must have spaces to be inside the body of function
def sumofnumbers():
    a = 10
    b = 20
    sum = a+b
    print (sum)
sumofnumbers()
# def just defines the keyword so we need to call it again to work with it

def addition(x,y):
    add = x + y
    print(add)
addition(100,20)
# this is used when the functions need to be repeated with different values
# this is parametrized functions
# the value which we pass to a function is called its argument

# return keyword keeps the value stored and can be used again in the program
# it brings the value out of a given function
def multiply(a,b):
    mul = a*b
    return mul
print(multiply(10,37))


def sum_of_two_numbers(x, y):
    sum = x + y
    return sum

result = sum_of_two_numbers(10, 20)
print(result)

result = sum_of_two_numbers(50, 60)
print(result)
result = sum_of_two_numbers(100, 200)
print(result)