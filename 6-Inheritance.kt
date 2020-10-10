fun main() {

    var anjing = Anjing()
    anjing.bread = "labra"
    anjing.color = "black"
    anjing.bark()
    anjing.eat()

    var kucing = Kucing()
    kucing.age = 7
    kucing.color = "brown"
    kucing.meow()
    kucing.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()
}

open class Animal {         // Super,Parent,Base Class

    var color: String = ""

    fun eat() {
        println("Eat")
    }
}

class Dog : Animal() {      // Sub,Child,Derived Class

    var bread: String = ""

    fun bark() {
        println("Bark")
    }
}

class Cat : Animal() {      // Sub,Child,Derived Class

    var age: Int = -1

    fun meow() {
        println("Meow")
    }
}
