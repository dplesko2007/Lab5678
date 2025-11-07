package world

class Quest(
    title: String,
    val Duration: Int,
    reward: Int,
    val difficulty: String,
    val questType: QuestType
) : Mission(title, reward) {
    fun printinfo() {
        println("quest name")
        println("Тип квества: ${questType.description}")
        println("Время выполнения: $Duration ч.")
        println("Награда: $reward золотых")
        println("Уровень сложности: $difficulty")
    }
    fun getReward(): Int {
        return 500
    }
    fun getDifficulty(): String = "Легкий"
    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }
    fun goldPerHour(): Int {
        require (Duration >= 0 && reward>=0) {"Длительность и награда не могут быть отрицательными!"}
        if (Duration == 0) return 0
        return if (Duration == 0) 0  else reward/Duration
    }
    override fun describe() {
        println("Квест '$title' на $Duration часов, сложность: $difficulty, награда: $reward золотых")
        println("Тип квеста: ${questType.description}")
    }
    fun showOnlyExploreQuests(quests: List<Quest>) {
        println("Только исследовательские квесты")
        val exploreQuests = quests.filter { it.questType == QuestType.EXPLORE }

        if (exploreQuests.isEmpty()) {
            println("Исследовательских квестов не найдено")
        } else {
            exploreQuests.forEach { quest ->
                quest.describe()
                println()
            }
        }
    }
//    fun init(title: String, Duration: Int, reward: Int, difficulty: String) {
//        this.title = title
//        this.Duration = Duration
//        this.reward = reward
//        this.difficulty = difficulty
//    }
}