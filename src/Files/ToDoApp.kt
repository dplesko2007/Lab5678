package Files

import java.io.File

fun main() {
//    val file = File("demo.txt")
//    println("Creating a file.")
//    file.appendText("Hello world\n")
//    println("\n File:")
//    println(file.readText())
//    println("Reading a file: ")
//    val lines = file.readLines()
//    for((index, line) in lines.withIndex()) {
//        println("${index + 1}: $line")
//    }
//    val file2 = File("toDo.txt")
//    println("Welcome to To-Do App!")
//    while (true) {
//        print("Input your task(or 0 to exit): ")
//        val userInput = readln()
//        if (userInput == "0") {
//            break
//        } else {
//            file.appendText("$userInput\n")
//            println("task is saved!")
//        }
//        println("\nYour To-Do list: ")
//        println(file.readText())
//    }
    val file = File("toDo.txt")
    val index = 0
    while (true) {
        println("\nTASK MENU")
        println("1 - Add task")
        println("2 - Show all tasks")
        println("3 - Delete Task")
        println("0 - Leave")
        print("Select task: ")

        when (readln()) {
            "1" -> {
                print("Type new task: ")
                val task = readln()
                file.appendText("$task\n")
                println("Task is added")
            }
            "2" -> {
                println("All tasks: ")
                if (file.exists() && file.readLines().isNotEmpty()) {
                    file.readLines().forEachIndexed { index, task -> println("${index + 1}. $task")
                    }
                } else { println("! Task list is empty.")  }
            }
            "3" -> {
                val tasks = file.readLines().toMutableList()
                if (tasks.isEmpty()) {
                    println("Список задач пуст.")
                } else {
                    print("Задачи для удаления: ")
                    tasks.forEachIndexed { index, task -> println("${index + 1}. $task") }
                }
                print("Введите номер задачи для удаления: ")
                val num = readln().toIntOrNull()
                if (num == null || num !in 1..tasks.size) {
                    println("Некорректный номер.")
                } else {
                    val removed = tasks.removeAt(num-1)
                    file.writeText("")
                    tasks.forEach {file.appendText("$it\n")}
                    println("Задача \"$removed\" удалена")
                }
            }
            "0" -> {
                println("Выход из программы.")
                break
            }
            else -> println("Incorrect input. Try again.")
        }
    }
}