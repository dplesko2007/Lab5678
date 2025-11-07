package artifact

class Relic(
    name: String,
    power: Int,
    rarity: Rarity,
    val origin: String,
    var charges: Int
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("Происхождение: $origin, Заряды: $charges")
    }

    override fun use(): String {
        if (charges > 0) {
            charges--
            return "$name активировано! Осталось зарядов: $charges (происхождение: $origin)"
        } else {
            return "$name разряжена! Нужно перезарядить"
        }
    }
}