class Item {
    val name: String
    val price: Int
    constructor(name: String, price: Int) {
        this.name = name
        this.price = price
    }
    fun displayInfo() {
        println("item: $name, price: $price")
    }
}

class Contract(
    val clientName: String,
    val taskDescriprion: String,
    val reward: Int,
    val isUrgent: Boolean = false
) {
    fun printContractInfo() {
        println("Client: $clientName")
        println("Task: $taskDescriprion")
        println("Reward: $reward")
        println("Urgency: ${if (isUrgent) "Urgent!" else "Usual"}")
    }
}