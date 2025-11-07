package transport

fun main() {
    val transports = listOf<transport>(
        Horse(),
        Dragon("Смауг", 150, 2),
        Boat("Быстрая лодка", 40, 8),
        Teleport("Магический портал", 2000, 3)
    )

    println("Система транспорта")
    for (transport in transports) {
        transport.describe()
        transport.move()
        transport.specialAbility()
        println("---")
    }

    println("Демонстрация полиморфизма")
    transports.forEach { it.move() }
}