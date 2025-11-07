class Student {
    var name: String = ""
    var age: Int = 0

    fun init(name: String, age: Int) {
        this.name = name
        this.age = age
        println("студент создан")
    }
    fun introduce() {
        println("Меня зовут $name, мне $age лет")
    }
    fun haveBirthday() {
        age+=1
        println("$name празднует день рождения! теперь ему $age лет")
    }
}