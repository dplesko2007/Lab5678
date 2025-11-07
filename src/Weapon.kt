class Weapon() {
    val name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    val type: String = "Обычное"
    fun showInfo() {
        print("Оружие: $name, Урон: $damage, Прочность: $durability, Тип: $type")
    }
    fun use() {
        if (durability<10) println("Оружие сломано") else durability-=10
    }
    fun upgrade(bonus: Int) {
        damage+=bonus
    }
}