package com.javiaps94.workingwithfunctions.kotlin

private fun printString(value: String) {
    println(value)
}

fun addTwoNumbers(numberOne: Double, secondNumber: Double = 3.9) = numberOne + secondNumber

fun printSomeMaths(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    fun functionWithinFunction(s: String) {
        println(s)
    }

    functionWithinFunction("Hello")
}

fun methodTakesLambda(input: String, action: (String) -> Int ) {
    println(action(input))
}

fun main(args: Array<String>) {
    printString("Hello world")
    println(addTwoNumbers(5.5, 9.6))
    println(addTwoNumbers(5.5))
    printSomeMaths(two = 5.2, one = 3.2)
}