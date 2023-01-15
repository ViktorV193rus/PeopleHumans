const val likes = 121
fun main() {
    println("Понравилось $likes ${likesHumansPeople()}")
}

fun likesHumansPeople(): String {
    val humans = "Человеку"
    val people = "Людям"
    return if (likes % 10 == 1 && likes % 100 != 11) {
        humans
    } else {
        people
    }
}

