class Pet:
    def __init__(self, n, a, c):
        self.name = n
        self.age = a
        self.color = c

    def show(self):
        print(f'{self.name} {self.age} {self.color}')


class Dog(Pet):
# in java we use extend keyword but in python we just write parent class in brackets
    def make_noise(self):
        print("bark")


class Cat(Pet):
    def make_noise(self):
        print("meow")


d = Dog("tom", 8, "white")
d.show()
d.make_noise()

c = Cat("jerry", 4, "yellow")
c.show()
c.make_noise()

# in built modules - random, collections are there
# external python packages - selenium can be added
# for file reading and writing - csv format is used