package com.javiaps94.datatypes.kotlin

fun main(args: Array<String>) {
  val double = 32.2
  println("Is double my variable ${double is Double}")
  println("My variable is ${double::class.qualifiedName}")

  val myInteger = 2
  println("My integer variable is ${myInteger::class.qualifiedName}")
}