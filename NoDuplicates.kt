package com.borapocan.noduplicates

class NoDuplicates {
}

fun main(args: Array<String>) {

    val input = readLine()!!.split(' ').map { it.toUpperCase() }

    var duplicates: Boolean = false

    input.forEach {

        if (input.subList(input.indexOf(it) + 1, input.size).contains(it)) duplicates = true

    }

    if (duplicates) println("no") else println("yes")

}