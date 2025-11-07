package artifact

class Potion(
    name: String,
    power: Int,
    rarity: Rarity,
    val effectDuration: Int,
    val isConsumable: Boolean = true
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("Длительность эффекта: ${effectDuration}сек, Одноразовое: $isConsumable")
    }

    override fun use(): String {
        return if (isConsumable) {
            "$name использовано! Эффект длится $effectDuration секунд"
        } else {
            "$name активировано! Эффект длится $effectDuration секунд (можно использовать повторно)"
        }
    }
}