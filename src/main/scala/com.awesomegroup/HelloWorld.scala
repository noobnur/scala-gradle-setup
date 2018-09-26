package com.awesomegroup

import scala.math._

object HelloWorld extends App {
    println("Hellow scala")
    println("Hello again")

    val friends1 = List("A1", "A2", "A3", "A4", "A5")
    val fTowns1 = List(("A1", "X1"), ("A2", "X2"), ("A3", "X3"), ("A4", "X4"))
    val distTable1 = Map("X1" -> 100.0, "X2" -> 200.0, "X3" -> 250.0, "X4" -> 300.0)

//    for (k <- friends1) {
//        for (t <- fTowns1) {
//            println(
//        }
//    }

    println(distTable1.zip(friends1))
    println(friends1.zip(distTable1))


    for (k <- distTable1) {
        println(k)
    }

    def dist(a: Double, c: Double) : Double = {
        sqrt(pow(c,2) - pow(a,2))
    }

    println(dist(250, 300))
    var total : Double = 100+173.20508+150+165.831239+300
    printf("%f", total)
}
