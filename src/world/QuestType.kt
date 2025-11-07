package world

enum class QuestType(val description: String) {
    DELIVERY("Object delivery"),
    ELIMINATION("Characters.Enemy elimination"),
    ESCORT("Character escort"),
    EXPLORE("Territory exploration"),
    BOSSFIGHT("Bossfight")
}