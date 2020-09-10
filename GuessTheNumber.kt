package com.borapocan.kattis

class GuessTheNumber {
}

fun main() {

    val maxRound = 10

    val randomNumber = (1..1000).random()

    for (i in 1..maxRound) {

        val guess = readLine()!!.toInt()

        var answer: String

        if (guess > randomNumber) {

            answer = "lower"

            println(answer)

        }else if (guess < randomNumber) {

            answer = "higher"

            println(answer)

        }else {

            answer = "correct"

            println(answer)

            if (answer == "correct") {

                break

            }

        }

    }

}