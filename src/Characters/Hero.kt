package Characters

import magic.Spell
import world.Quest

class Hero {
    var name: String = "unefine"
    var gender: String = "not found"
    var role: String = "Wanderer"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var element: String = "none"

    fun SayHello() {
        println("My name is $name. My journey has just began.")
    }

    fun showStatus() {
        println("Name: ${name} | Gender: ${gender} | Class: ${role} | HP: ${hp}, MP: ${mp} | Level: $level | Element: $element")
    }

    fun meditate() {
        println("$name meditates.")
        mp+= 20
        println("Hero restored mana. MP: $mp")
    }

    fun TakeDmg(amount: Int) {
        println("$name got hit!")
        hp -= amount
        if (hp < 0) hp = 0
        println("hp left: $hp")
        Die()
    }

    fun castSpell() {
        if (mp-10 <= 0) {
            println("Hero cannot cast a spell due to a lack of mana")
        }
        else {
            mp -= 10
            println("$name casted a spell. MP: $mp")
        }
    }

    fun heal() {
        if (mp-10 <= 0) {
            println("Hero cannot cast heal due to a lack of mana")
        }
        else {
            mp-=10
            hp+=10
            println("Hero's healing. HP: $hp; MP: $mp")
        }
    }

    fun Greet(name: String) {
        println("Hello $name")
    }

    fun Die() {
        if (hp == 0) {
            println("$name is dead")
        }
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name attacks enemy ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name uses spell '$spellName', against ${enemy.name}!")
        if (element==enemy.element) {
            println("Elements are matching! Damage is lowered.")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        } else {
            enemy.takeDamage(damage)
        }
        mp -= 10
        if (mp < 0) mp = 0
        println("$mp mana left")
    }
    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")
        println("$name атакует первым!")
        opponent.TakeDmg(15)
        println("${opponent.name} отвечает")
        this.TakeDmg(15)
        println("Дуэль завершена")
        println("Состояние героев: ")
        this.showStatus()
        opponent.showStatus()
    }
    fun isAlive(): Boolean {
        return hp>0
    }
    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "easy" -> level >= 1
            "medium" -> level >= 3
            "hard" -> level >= 5
            else -> false
        }
        if (canAccept) {
            println("$name может принять квест ${quest.title}")
        } else {
            println("$name не может принять ${quest.title}")
        }
        return canAccept
    }
    fun canCast(spell: Spell): Boolean {
        val nameCondition = spell.name.length <= level * 2
        val sizeCondition = spell.width <= 5 && spell.height <= 5
        return nameCondition && sizeCondition
    }
}