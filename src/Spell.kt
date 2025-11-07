class Spell {
    var name: String = "?"
    var width: Int = 1
    var height: Int = 1
    var symbol: String = "?"

    constructor(name: String, width: Int, height: Int, symbol: String) {
        this.name = name
        this.width = width
        this.height = height
        this.symbol = symbol
    }

    constructor (name: String, size: Int, symbol: String) {
        this.name = name
        this.width = size
        this.height = size
        this.symbol = symbol
    }

    fun cast() {
        println("Casting $name!")
        repeat(height) {
            repeat(width) {
                println(symbol)
            }
            println()
        }
    }
    fun area(): Int {
        return width*height
    }
}

class Quest {
    val title: String
    val duration: Int
    val reward: Int
    val difficulty: String
//    fun init(title: String, duration: Int, reward: Int, difficulty: String) {
//        this.title = title
//        this.duration = duration
//        this.reward = reward
//        this.difficulty = difficulty
//    }
    constructor (title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }

}