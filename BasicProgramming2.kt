package com.borapocan.kattis

fun main() {

    val (N,t) = readLine()!!.split(' ').map { it.toInt() }

    val input = readLine()!!.split(' ').map { it.toInt() }

    val A = arrayListOf<Int>()

    if (input.size == N) {

        for (i in input) {

            A.add(i)
        }
    }

    if (t == 1) {

        for (x in A) {

            for (y in A) {

                if (x == y) {

                    continue
                }
                if (x + y == 7777) {

                    println("Yes")

                    return
                }

            }

        }

        println("No")

    }
    else if (t == 2) {

        if (A.toSet().size == A.size) {

            println("Unique")

        }else {

            println("Contains duplicate")
            
        }

    }
    else if (t == 3) {

        val times = A.groupingBy { it }.eachCount()

        val ans = times.filter { it.value > N / 2}

        println(ans.keys.toString().removeSurrounding("[","]"))

        if (ans.isEmpty()) {

            println(-1)

        }

    }
    else if (t == 4) {

        var median = 0

        var median2 = 0

        if (A.size % 2 == 0) {

            for (i in A.sorted()) {

                median = A.size / 2

                median2 = (A.size / 2) - 1

            }

            println("${A.sorted()[median2]} ${A.sorted()[median]}")

        }else {

            median = A[A.size / 2]

            println(median)

        }

    }
    else if (t == 5) {

        val list = arrayListOf<Int>()

        for (x in A) {

            if (x in 100..999) {

                list.add(x)
            }

        }

        println(list.sorted().toString().removeSurrounding("[","]").replace(",",""))

    }

}