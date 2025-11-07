package magic

import Spell

fun main() {
    val fireWall = Spell("Fire Wall", 5, 3, "\uD83D\uDD25")
    fireWall.cast()
    val iceSheet = Spell("Ice shield", 4, "\u2744\uFE0F")
    iceSheet.cast()

    println(fireWall.area())
    println(iceSheet.area())


}