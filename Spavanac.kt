package com.borapocan.spavanac

class Spavanac {
}

fun main(args: Array<String>) {

    var (hour, minute) = readLine()!!.split(' ').map { it.toInt() }

    when {

        minute - 45 >= 0 -> minute -= 45

        minute - 45 < 0 && hour > 0 -> {

            hour -= 1

            minute = 60 + (minute - 45)

        }

        minute - 45 < 0 && hour <= 0 -> {

            hour = 23

            minute = 60 + (minute - 45)

        }


    }

    println("$hour $minute")

}

