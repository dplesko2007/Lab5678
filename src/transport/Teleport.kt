package transport

class Teleport(name: String = "Телепорт", speed: Int = 1000, capacity: Int = 1) : transport(name, speed, capacity) {
    override fun describe() {
        println("Телепорт: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name мгновенно перемещается в другое место")
    }

    override fun specialAbility() {
        println("$name нужна мана для активации, мгновенное перемещение")
    }
}