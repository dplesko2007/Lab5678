package Characters

class NPC(
    name: String,
    hp: Int = 100,
    element: String = "None",
    val faction: String = "Citizens",
    val hasQuest: Boolean = false
) : GameCharacter(name, hp, element) {
    fun giveQuest() : String {
        return if (hasQuest) {
            "$name offers you a quest"
        } else {
            "$name doesnt have tasks for you"
        }
    }
    fun trade() {
        println("$$name started a trade")
    }
}
