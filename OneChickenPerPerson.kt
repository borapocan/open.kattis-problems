package com.borapocan.kattis

class OneChickenPerPerson {
}

fun main() {

    val input = readLine()!!.split(' ').map { it.toInt() }

    val numberOfPeople = input[0]

    val numberOfChicken = input[1]

    if (numberOfPeople != numberOfChicken) {

        when {

            numberOfChicken - numberOfPeople == 1 ->
                println("Dr. Chaz will have ${numberOfChicken - numberOfPeople} piece of chicken left over!")

            numberOfPeople < numberOfChicken ->
                println("Dr. Chaz will have ${numberOfChicken - numberOfPeople} pieces of chicken left over!")

            numberOfPeople - numberOfChicken == 1 ->
                println("Dr. Chaz needs ${numberOfPeople - numberOfChicken} more piece of chicken!")

            numberOfPeople > numberOfChicken ->
                println("Dr. Chaz needs ${numberOfPeople - numberOfChicken} more pieces of chicken!")


        }

    }

}