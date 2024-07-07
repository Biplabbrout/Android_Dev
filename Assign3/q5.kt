data class Person(val name: String, val age: Int)

fun Persons(persons: MutableList<Person>) {
    for (i in 0 until persons.size) {
        for (j in 0 until persons.size - 1 - i) {
            val person1 = persons[j]
            val person2 = persons[j + 1]
            if (person1.age > person2.age || (person1.age == person2.age && person1.name > person2.name)) {
                persons[j] = person2
                persons[j + 1] = person1
            }
        }
    }
}


fun main() {
    val persons = mutableListOf(
        Person("rohit", 30),
        Person("virat", 25),
        Person("bumrah", 30),
        Person("hardik", 25)
    )
    
    Persons(persons)
    persons.forEach { println(it) }
    
}
