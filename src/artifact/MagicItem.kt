package artifact

open class MagicItem(
    val name: String,
    val power: Int,
    val rarity: Rarity
) {
    open fun describe() {
        println("Артефакт: $name, сила: $power, редкость: ${rarity.name.lowercase()}")
    }

    open fun use(): String {
        return "$name используется с базовым эффектом"
    }
}
enum class Rarity {
    common, rare, epic
}