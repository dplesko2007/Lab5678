package magic

import javax.print.attribute.standard.Sides

class Spell(
    val name: String,
    val width: Int = 0,
    val height: Int = 0,
    symbol: String
) : MagicEffect(name, symbol, 10) {

    constructor(name: String, height: Int, symbol: String) : this(name, 1, height, symbol)

    fun cast() {
        println("Кастуем $name")
        repeat(height) {
            repeat(width) {
                print(symbol)
            }
            println()
        }
    }

    fun area(): Int {
        return width * height
    }

    fun description(): String {
        return "Заклинание $name занимает область ${width}xheight и использует символ $symbol"
    }
}