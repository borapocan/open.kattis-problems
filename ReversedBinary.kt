package com.borapocan.kattis


fun main() {

    fun convertBinaryToDecimal(num: Long): Int {

        @Suppress("NAME_SHADOWING") var num: Long = num
        var decimalNumber = 0
        var i = 0
        var remainder: Long

        while (num.toInt() != 0) {

            remainder = num % 10
            num /= 10
            decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
            ++i
        }

        return decimalNumber

    }

    val n = readLine()!!.toInt()

    val binary = Integer.toBinaryString(n)

    val reversed = binary.reversed().toLong()


    val output = convertBinaryToDecimal(reversed)

    println(output)
}