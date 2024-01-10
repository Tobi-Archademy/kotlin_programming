class DataClassLessons(val name: String, val age: Int, val gender: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DataClassLessons

        if (name != other.name) return false
        if (age != other.age) return false
        if (gender != other.gender) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + gender.hashCode()
        return result
    }
}


// All these class and corresponding properties can be modified into a simple data class

data class DataClassLesson(val name: String, val age: Int, val gender: String) {
    private var balance: Int = 0

    override fun toString(): String {
        return "DataClassLesson(name = '$name', age = $age, gender = '$gender', balance = $balance)"
    }
}