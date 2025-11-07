package transport

open class transport(
    val name: String,
    var speed: Int,
    var capacity: Int
) {
    open fun describe() {
        println("Трнаспорт $name, скорость: $speed, вместительность: $capacity")
    }
    open fun move() {
        println("Транспорт двигается со скоростью $speed")
    }
    open fun specialAbility() {
        println("$name имеет особую способность")
    }
}