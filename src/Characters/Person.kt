import world.Quest
import world.QuestType
import Characters.Trader

private val Enemy.np: String

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

    val orochimaru = Enemy()
    orochimaru.name = "Orochimaru"
    naruto.showStatus()
    println("${naruto.name} saw enemy ${orochimaru.name}! His health is ${orochimaru.np}")
    naruto.attack(orochimaru, 25)

    naruto.duel(gojo)

    val trader = Trader("Ralph")

    trader.addQuest(Quest("Collect greenies", 2, 50, "easy", QuestType.DELIVERY))
    trader.addQuest(Quest("Kill wolves",3,100,"Medium", QuestType.ELIMINATION))

    trader.showAviableQuests()

    val easyQuest = Quest("Сбор трав",2,100,"Легкий", QuestType.EXPLORE)
    val hardQuest = Quest("Охота на дракона",10,1000,"Сложный", QuestType.BOSSFIGHT)

    naruto.canAcceptQuest(easyQuest)
    gojo.canAcceptQuest(hardQuest)

    val enemy1 = Enemy(name = "Goblin", hp =30,"alive","none")
    println(enemy1.getThreatLevel())
    val enemy2 = Enemy("Ork",100,"alive","none")
    println(enemy2.getThreatLevel())
    val enemy3 = Enemy("dragon",200,"alive","fire")
    println(enemy3.getThreatLevel())
//    val hero1 = Hero(name = "Arthur", hp = 100)
//    println("Is hero alive? ${hero1.isAlive()}")
}
