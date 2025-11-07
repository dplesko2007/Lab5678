package world

import kotlin.time.Duration

fun main() {
    val quest = Quest("Побег из замка", 5,700,"Сложный", QuestType.EXPLORE)
    println("${quest.isHard()}")

    val missions = listOf<Mission>(
        Quest("Monster hunt",3,600,"medium", QuestType.BOSSFIGHT),
        SpecialOperation("Night raid", 1500, requiredClearance = 2, isCovert = true),
        Contract("Caravan escort", "Merchant guild", "deliver the package",800, isUrgent = true)

    )
    for (mission in missions) {
        mission.describe()
        println("High reward? ${if (mission.isHighReward()) "Yes" else "No"}")
        println()

    }
    val escortQuest = Quest(
        title = "Сопроводи торговца до деревни",
        Duration = 4,
        120,
        "Средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printinfo()
    val quests = listOf(
        Quest(
            title = "Доставить посылку в соседний город",
            Duration = 2,
            reward = 200,
            difficulty = "Лёгкий",
            questType = QuestType.DELIVERY
        ),
        Quest(
            title = "Охотиться на гоблинов в лесу",
            Duration = 4,
            reward = 450,
            difficulty = "Средний",
            questType = QuestType.ELIMINATION
        ),
        Quest(
            title = "Сопроводить караван через горы",
            Duration = 6,
            reward = 800,
            difficulty = "Сложный",
            questType = QuestType.ESCORT
        )
    )
    println("Все квесты")
    quests.forEach { quest ->
        quest.describe()
        println()
    }
}


//    val quests = mutableListOf<Quest>() {
//        for (i in 1..3) {
//            println("$i")
//            val q = Quest()
//            print("Название: ")
//            val title = readln()
//            print("Время: ")
//            val Duration = readln().toInt()
//            print("Награда: ")
//            val reward = readln().toInt()
//            print("сложность: ")
//            val difficulty = readln()
//            q.inti(title, Duration, reward, difficulty)
//            quests.add(q)
//            println()
//        }
//        println("Все доступные квесты: ")
//        for (q in quests) {
//            q.printInfo()
//        }
//    }
//    val escortQuest: Quest (
//        "Merchant escort",
//        4,
//        120,
//        "Easy",
//        QuestType.ESCORT
//    );
//    val quest = Quest("Artefact search", 3,800,"Medium")
//    val contract = items.Contract("Wagon defend","Merchant guild", "Defend the wagon", 1200)
//    val specialOp = SpecialOperation("Opearion 'Shadow'", 2500,2,true)
//
//    println("Quest info:")
//    println("name: ${quest.title}, reward: ${quest.reward}")
//
//    println("\n items.Contract info:")
//    println("name: ${contract.title}, client: ${contract.clientName}")
//
//    println("\n Operation info:")
//    println("name: ${specialOp.title}")
//    specialOp.showReward()
//    quest.init(title, duration, reward, difficulty)
//    quest.init("Troll hunt",3,500,"Medium")
//    quest.init(
//        title = "Troll hunt",
//        reward = 500,
//        Duration = 3,
//        difficulty = "medium"
//    )