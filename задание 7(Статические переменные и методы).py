class Animal:
    numInstances = 0
    def __init__(self, name):
        self.name = name
        Animal.numInstances = Animal.numInstances + 1
    def voice(self):
        pass
def printNumInstances() :
    print ("количество всех созданных экземпляров",Animal.numInstances)
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
printNumInstances()