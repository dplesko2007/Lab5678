class Group {
    var groupName: String = ""
    var students = mutableListOf<Student>()

    fun init(groupName: String, students: List<Student>) {
        this.groupName = groupName
        this.students.addAll(students)
        println("Группа создана")
    }

    fun addStudent(student: Student) {
        students.add(student)
        println("Студент ${student.name} добавлен в группу $groupName")
    }
    fun listStudents() {
        println("Студенты группы $groupName: ")
        for (i in students) {
            println(i.name)
        }
    }
    fun celebrateBirthdays() {
        for (i in students) {
            i.haveBirthday()
        }
    }
}