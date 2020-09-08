package com.borapocan.kattis

fun main() {

    fun checkPythag(a: Int, b: Int, c: Int) : Boolean {

        val hyp: Double = Math.max(a.toDouble(), Math.max(b.toDouble(), c.toDouble()))

        if (hyp == a.toDouble()) {

            val check = Math.sqrt(b.toDouble() * b.toDouble() + c.toDouble() * c.toDouble())

            if (hyp == check) return true

            return false
        }

        if (hyp == b.toDouble()) {

            val check = Math.sqrt(a.toDouble() * a.toDouble() + c.toDouble() * c.toDouble())

            if (hyp == check) return true

            return false
        }

        if (hyp == c.toDouble()) {

            val check = Math.sqrt(b.toDouble() * b.toDouble() + a.toDouble() * a.toDouble())

            if (hyp == check) return true

            return false
        }

        return false
    }


    while (true) {

        val input = readLine()!!.split(' ').map { it.toInt() }

        val a = input[0]; val b = input[1]; val c = input[2]

        if (a == 0 && b == 0 && c == 0) {

            break
        }

        if (checkPythag(a,b,c)) println("right") else println("false")

    }

}