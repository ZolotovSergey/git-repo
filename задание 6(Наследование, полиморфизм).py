class Animal:
    def __init__(self, name):
        self.name = name
    def voice(self):
        pass
class Dog(Animal):
    def voice(self):
        print(self.name + " сказал: гав-гав!")
class Cat(Animal):
    def voice(self):
        print(self.name + " сказал: мяу-мяу!")
class Snake(Animal):
    def voice(self):
        print(self.name + " сказал: Шшшшш!")
dog = Dog("бобик")
cat = Cat("маркиз")
snake = Snake("киря")
dog.voice()
cat.voice()
snake.voice()
