import java.util.*

fun main() {
    println("Welcome to the Platypus Forest Protection Game!")
    println("You are a brave platypus trying to stop humans from destroying your forest. Let's get started!")

    val scanner = Scanner(System.`in`)
    var humansCount = 10

    while (humansCount > 0) {
        println("You have encountered $humansCount humans in the forest. What will you do?")
        println("1. Attack the humans")
        println("2. Call for help")
        println("3. Hide and observe")

        val choice = scanner.nextInt()
        when (choice) {
            1 -> {
                val platypusPower = (1..3).random()
                val humanPower = (1..5).random()
                if (platypusPower >= humanPower) {
                    println("You successfully scared away a human!")
                    humansCount--
                } else {
                    println("The human spotted you and you were unable to stop them. They continue to destroy the forest.")
                }
            }
            2 -> {
                println("You called for help, and a group of other animals arrived to join your cause. They help you scare away the humans!")
                humansCount -= 3
            }
            3 -> {
                println("You decided to hide and observe the humans. You gather valuable information about their plans.")
            }
            else -> {
                println("Invalid choice. Please try again.")
            }
        }
    }

    println("Congratulations! You successfully stopped the humans from destroying the forest. The forest and its inhabitants are safe thanks to your bravery!")
}
