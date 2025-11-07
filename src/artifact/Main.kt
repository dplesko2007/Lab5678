package artifact

fun main() {
    val artifacts = listOf<MagicItem>(
        Weapon(
            name = "Меч Пламени",
            power = 45,
            rarity = Rarity.epic,
            damageType = "огонь",
            isTwoHanded = false
        ),
        Potion(
            name = "Зелье исцеления",
            power = 30,
            rarity = Rarity.rare,
            effectDuration = 60,
            isConsumable = true
        ),
        Relic(
            name = "Око Дракона",
            power = 75,
            rarity = Rarity.epic,
            origin = "демоническое",
            charges = 3
        ),
        Weapon(
            name = "Ледяной посох",
            power = 35,
            rarity = Rarity.rare,
            damageType = "лед",
            isTwoHanded = true
        ),
        Potion(
            name = "Эликсир силы",
            power = 25,
            rarity = Rarity.common,
            effectDuration = 120,
            isConsumable = false
        )
    )

    println("Система магических артефактов")

    for (artifact in artifacts) {
        println("\n---")
        artifact.describe()
        val useResult = artifact.use()
        println("Использование: $useResult")
    }

    println("Тестирование реликвии")
    val relic = artifacts[2] as Relic
    println("Начальные заряды: ${relic.charges}")
    repeat(4) { index ->
        println("Попытка ${index + 1}: ${relic.use()}")
    }
}