package transport

class Boat(name: String = "Лодка", speed: Int = 30, capacity: Int = 6) : transport(name, speed, capacity) {
    override fun describe() {
        println("Лодка: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name плывёт по воде")
    }

    override fun specialAbility() {
        println("$name может перевозить группу по рекам и озёрам")
    }
}