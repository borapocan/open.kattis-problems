package com.borapocan.cetvrta

import java.util.*
import kotlin.collections.ArrayList

class Cetvrta {
}

fun main(args: Array<String>) {



    val x = arrayListOf<Int>()

    val y = arrayListOf<Int>()

    val sc = Scanner(System.`in`)

    for (q in 0..2) {

        x.add(sc.nextInt())

        y.add(sc.nextInt())

    }

    val perX = 2 * (x.max()!! + x.min()!!)

    val perY = 2 * (y.max()!! + y.min()!!)

    when {

        x[0] == x[1]  -> print(x[2].toString() + " ")

        x[0] == x[2]  -> print(x[1].toString() + " ")

        x[1] == x[2]  -> print(x[0].toString() + " ")

        y[0] == y[1] -> print(y[2])

        y[0] == y[2] -> print(y[1])

        y[1] == y[2] -> print(y[0])

    }

    when {

        y[0] == y[1] -> println(y[2])

        y[0] == y[2] -> println(y[1])

        y[1] == y[2] -> println(y[0])
    }


}