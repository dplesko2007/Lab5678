package transport

class Horse(name: String = "Боевой конь", speed: Int = 60, capacity: Int = 2) : transport(name, speed, capacity) {
    override fun describe() {
        println("Скакун: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name скачет по равнинам")
    }

    override fun specialAbility() {
        println("$name может ускориться в бою")
    }
}