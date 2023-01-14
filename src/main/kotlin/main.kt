const val likes = 1001
fun main() {
    println("Понравилось $likes ${likesHumansPeople()}")
}

    fun likesHumansPeople(): String {
        val humans = "Человеку"
        val people = "Людям"
        return if (likes % 2 == 0) {
            people
        } else {
            humans
        }
    }
//Мне кажется я как то не так реализовал это... Дайте пожалуйста комментарий
