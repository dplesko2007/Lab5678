package Characters

class Boss(
    name: String,
    hp: Int,
    element: String,
    val phaseCount: Int = 3,
    val isFinalBoss: Boolean = false
): Enemy(name, hp) {
    fun dropLoot(): String {
        return if (isFinalBoss) {
            "Легендарные предметы"
        } else {
            "Эпические предметы"
        }
    }
    fun startPhase(phaseNumber: Int) {
        require(phaseNumber in 1..phaseCount) {"Неверный номер фазы"}
        println("$name активирует фазу $phaseNumber")
    }
}