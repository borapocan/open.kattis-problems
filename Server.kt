package com.borapocan.kattis

class Server {
}

fun main() {

    val input = readLine()!!.split(' ').map{ it.toInt() }

    val serverMin = readLine()!!.split(' ').map{ it.toInt() }

    val tasks = arrayListOf<Int>()
    tasks.addAll(serverMin)

//    println(tasks)

    var currentTotalTime = 0

//    println(tasks.sum())

    var output = 0

    for (i in 0..input[0]) {

        if (tasks[i] + currentTotalTime <= input[1]) {

            currentTotalTime += tasks[i]

//           println(currentTotalTime)

            output = i + 1

        }else {

            break

        }

    }

    println(output)

}