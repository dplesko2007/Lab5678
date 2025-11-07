package Characters

open class Enemy {
    var name: String = "Unknown"
    var hp: Int = 100
    var status: String = "alive"
    var element: String = "none"

    constructor(name: String, hp: Int)

    fun takeDamage(amount: Int) {
        if (status == "alive") {
            hp -= amount
            if (hp<0) hp = 0
            Status()
            println("Received $amount of dmg. HP: $hp")
        }
        else {
            println("$name is $status")
        }
    }

    fun Status() {
        if (hp == 0) {
            status = "dead"
        }
    }
    fun isStrong(): Boolean {
        return hp>100
    }
    fun getThreatLevel(): String {
        if (hp<0) {
            return "Некорректное здоровье"
        }
        return when {
            hp <= 50 -> "Низкий"
            hp >= 150 -> "Средний"
            else -> "Высокий"
        }

    }
    var agressionLevel: Int = 2
    fun calculatePower(agressionLevel: Int): Int {
        return hp * agressionLevel
    }
}