package artifact

class Weapon(
    name: String,
    power: Int,
    rarity: Rarity,
    val damageType: String,
    val isTwoHanded: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("Тип урона: $damageType, Двуручное: $isTwoHanded")
    }

    override fun use(): String {
        return "Наносит $damageType урон силой $power"
    }
}