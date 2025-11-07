package pets

open class Pet(
    val name: String,
    val maxHealth: Int,
    val speed: Int, ) {

    fun describe() {
        println("a pet: $name, health: $maxHealth, speed: $speed")
    }
    fun makeSound() {
        println("$name makes a sound")
    }
}