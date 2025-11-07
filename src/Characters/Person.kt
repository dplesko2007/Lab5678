package Characters

import world.Quest
import world.QuestType

fun main() {
    val naruto: Hero = Hero()
    naruto.name = "Naruto"
    naruto.hp = 350
    naruto.mp = 150
    naruto.gender = "male"
    naruto.role = "Assasin"
    println("Name: ${naruto.name} | Gender: ${naruto.gender} | Class: ${naruto.role} | HP: ${naruto.hp}, MP: ${naruto.mp}")
    naruto.SayHello()

    val saske: Hero = Hero()
    saske.hp = 250
    saske.mp = 250
    saske.gender = "male"
    saske.role = "Shinobu"
    saske.name = "Saske"
    println("Name: ${saske.name} | Gender: ${saske.gender} | Class: ${saske.role} | HP: ${saske.hp}, MP: ${saske.mp}")
    saske.SayHello()

    val gojo: Hero = Hero()
    gojo.hp = 160
    gojo.mp = 300
    gojo.gender = "male"
    gojo.role = "Mage"
    gojo.name = "Gojo"
    println("Name: ${gojo.name} | Gender: ${gojo.gender} | Class: ${gojo.role} | HP: ${gojo.hp}, MP: ${gojo.mp}")
    gojo.SayHello()

    val orochimaru = Enemy("Orochimaru",200)
    orochimaru.name = "Orochimaru"
    naruto.showStatus()
    println("${naruto.name} saw enemy ${orochimaru.name}! His health is ${orochimaru.hp}")
    naruto.attack(orochimaru, 25)

    naruto.duel(gojo)

    val trader = Trader("Ralph")

    trader.addQuest(Quest("Collect greenies", 2, 50, "easy", QuestType.DELIVERY))
    trader.addQuest(Quest("Kill wolves",3,100,"Medium", QuestType.ELIMINATION))

    trader.showAviableQuests()

    val selectedQuest = trader.giveQuest(1)
    selectedQuest.describe()

    val easyQuest = Quest("Сбор трав",2,100,"Легкий", QuestType.EXPLORE)
    val hardQuest = Quest("Охота на дракона",10,1000,"Сложный", QuestType.BOSSFIGHT)

    naruto.canAcceptQuest(easyQuest)
    gojo.canAcceptQuest(hardQuest)

    val enemy1 = Enemy(name = "Goblin", hp = 30)
    println(enemy1.getThreatLevel())
    val enemy2 = Enemy("Ork", 100)
    println(enemy2.getThreatLevel())
    val enemy3 = Enemy("dragon", 200)
    println(enemy3.getThreatLevel())
//    val hero1 = Characters.Hero(name = "Arthur", hp = 100)
//    println("Is hero alive? ${hero1.isAlive()}")
    val blacksmith = NPC("Кузнец Ульфрик", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()
    val dragon = Boss(
        "Алдуин", 500, "Огонь", phaseCount = 4, isFinalBoss = true)
    dragon.startPhase(2)
    println(dragon.dropLoot())
    dragon.takeDamage(150)
//    val enemy: GameCharacter = Enemy("Jean")
//    val hero: GameCharacter = Hero(name = "Naruto")
//    val npc: GameCharacter = NPC("Merchant")

}
