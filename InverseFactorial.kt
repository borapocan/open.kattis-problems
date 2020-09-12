package com.borapocan.kattis

import java.math.BigInteger

//CPU Time Limit Exceeded

fun main(args: Array<String>) {

    val factorial = readLine()!!.toBigInteger()

    fun inverseFactorial(number: BigInteger): Int {

        var number = number

        var n = 1

        while (number!!.compareTo(BigInteger.ONE) == 1) {

            n++

            number = number.divide(n.toBigInteger())
        }

        return n
    }

    println(inverseFactorial(factorial))

}