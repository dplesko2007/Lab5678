package pets

fun main() {
    val wolf = Wolf()
    println(wolf.packSize)
    println(wolf.name)

    val pets = listOf(
        Wolf("Fenrir"),
        Cat("Murzik"),
        Eagle("Skywind"),
        Bear("Balu"),
    )
    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }
}
