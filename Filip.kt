package com.borapocan.filip

class Filip {
}

fun main(args: Array<String>) {

//    val a = readline()!!.toInt()
//
//    val b = readLine()!!.toInt()
//
//    val c = a % 10
//
//    val d = b % 10
//
//    if (c > d) {
//
//        println(a.toString().reversed())
//
//    }else if (d > c) {
//
//        println(b.toString().toInt())
//
//    }else if (c == 0 || d == 0) {
//
//        println("a & a.b & b cannot contain zeroes")
//
//    }

    val (a, b) = readLine()!!.split(' ').map { it.reversed().toInt() }

    when {

        a > b -> print(a)

        b > a -> print(b)

    }

}