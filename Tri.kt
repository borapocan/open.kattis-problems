package com.borapocan.tri

class Tri {
}

fun main(args: Array<String>) {

    val input = readLine()!!.split(' ').map { it.toInt() }

    val a = input[0]

    val b = input[1]

    val c = input[2]

    if (a+b==c) {

        println("$a+$b=$c");

    }

    else if (a-b==c)

    {

        System.out.println("$a-$b=$c");

    }

    else if (a/b==c)

    {

        System.out.println("$a/$b=$c");

    }

    else if (a*b==c)

    {

        println("$a*$b=$c");

    }

    else if (a==b+c)

    {

       println("$a=$b+$c");

    }

    else if (a==b-c)

    {

        System.out.println("$a=$b-$c");

    }

    else if (a==b/c)

    {

        System.out.println("$a=$b/$c");

    }

    else if (a==b*c)

    {

        System.out.println("$a=$b*$c");

    }

}