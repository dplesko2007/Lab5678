package transport

class Dragon(name: String = "Дракон", speed: Int = 120, capacity: Int = 3) : transport(name, speed, capacity) {
    override fun describe() {
        println("Дракон: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name летит высоко над землёй")
    }

    override fun specialAbility() {
        println("$name дышит огнём и перевозит героя по воздуху")
    }
}