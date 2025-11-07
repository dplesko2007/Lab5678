package world

class SpecialOperation(
    title: String,
    reward: Int,
    val requiredClearance: Int,
    val isCovert: Boolean
) : Mission(title, reward) {
    fun showReward() {
        println("Required Clearance: $requiredClearance")
        println("Stealth mode: ${if (isCovert) "Super secret" else "Usual"}")
    }
    override fun describe() {
        println("Спецоперация '$title'. Уровень допуска: $requiredClearance, режим: ${if (isCovert) "Секретно" else "Открыто"}, награда: $reward")
    }
}