package Characters
import world.Quest
import world.QuestType

class Trader(
    val name: String,
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun showAvailableQuests() {
        if (quests.isEmpty()) {
            println("У $name нет доступных квестов.")
            return
        }
        println("\nДоступные квесты от $name:")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золота")
        }
    }

    fun giveQuest(index: Int): Quest? {
        return if (index in 1..quests.size) {
            quests[index - 1]
        } else {
            null
        }
    }
    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Quest '${quest.title}' has been added to $name list")
    }
    fun removeQuest(index: Int): Boolean {
        return if (index in 1..quests.size) {
            val removedQuest = quests.removeAt(index - 1)
            println("Квест '${removedQuest.title}' удален из списка $name.")
            true
        } else {
            println("Некорректный номер квеста.")
            false
        }
    }
    fun start() {
        println("Добро пожаловать к торговцу $name")

        while (true) {
            println("Меню торговца")
            println("1 - Добавить квест")
            println("2 - Показать все квесты")
            println("3 - Взять квест (удалить из списка)")
            println("0 - Выйти")
            print("Ваш выбор: ")

            when (readln()) {
                "1" -> addQuestFromInput()
                "2" -> showAvailableQuests()
                "3" -> takeQuest()
                "0" -> {
                    println("До свидания! Возвращайтесь к торговцу $name снова!")
                    break
                }
                else -> println("Некорректный ввод. Попробуйте снова.")
            }
        }
    }
    private fun addQuestFromInput() {
        println("Добавление нового квеста")

        print("Введите название квеста: ")
        val title = readln()

        print("Введите длительность (часы): ")
        val duration = readln().toIntOrNull() ?: 1

        print("Введите награду (золото): ")
        val reward = readln().toIntOrNull() ?: 100

        print("Введите сложность: ")
        val difficulty = readln()

        println("Доступные типы квестов:")
        QuestType.values().forEachIndexed { index, type ->
            println("${index + 1}. ${type.name} - ${type.description}")
        }

        print("Введите номер типа квеста (1-${QuestType.values().size}): ")
        val typeIndex = readln().toIntOrNull()

        val questType = if (typeIndex in 1..QuestType.values().size) {
            QuestType.values()[typeIndex!! - 1]
        } else {
            println("Некорректный номер типа. Установлен тип по умолчанию: DELIVERY")
            QuestType.DELIVERY
        }
        val newQuest = Quest(title, duration, reward, difficulty, questType)
        addQuest(newQuest)
    }
    private fun takeQuest() {
        if (quests.isEmpty()) {
            println("Список квестов пуст.")
            return
        }
        showAvailableQuests()
        print("Введите номер квеста для взятия: ")
        val questNumber = readln().toIntOrNull()

        if (questNumber != null) {
            val quest = giveQuest(questNumber)
            if (quest != null) {
                println("\nВы взяли квест:")
                quest.describe()
                removeQuest(questNumber)
            } else {
                println("Квест с номером $questNumber не найден.")
            }
        } else {
            println("Некорректный номер квеста.")
        }
    }
}