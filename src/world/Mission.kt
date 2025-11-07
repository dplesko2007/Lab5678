package world

open class Mission(val title: String,
    val reward: Int) {
    open fun describe() {
        println("Миссия: $title, Награда: $reward монет")
    }
    fun isHighReward(): Boolean {
        return reward > 100
    }

}