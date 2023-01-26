# class is a blueprint
# object is an instance of the class
# methods are functions when defined inside a class
# syntax of class and object is:-
# class a:
# object = a()


class Dog:
# self is an object which must be used in python for methods
# self acts as the default parameter for methods
# the first parameter should always be self
    def __init__(self, n, a, c):
        # special init method with given syntax
        # init method is called by itself
        # we don't need to call it explicitly
        # init is basically a constructor in python
        # self is similar to this keyword in java
        # self denotes the object itself
        self.name = n
        self.age = a
        self.color = c

    def eat(self):
        print("dog is eating")

    def make_noise(self):
        print("bark")


d = Dog("tom", 5, "black")  # created an object of the class
d.make_noise()
print(d.name)
print(d.age)

d1 = Dog("jerry", 8, "grey")
d1.eat()
print(d1.name)
print(d1.age)

def moolya():
    pass
# pass keyword is used if we want to write the logic of function later
# without this error will be thrown