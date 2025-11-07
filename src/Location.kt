class Location {
    val name: String = "none"
    val dangerLevel: String = "low"
    var requiredLevel: Int = 5

    fun isDangerous(): Boolean {
        if (dangerLevel == "Высокий") return true else return false
    }
}