package com.javiaps94.datatypes.kotlin

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
  var result: Any
  var randomNumber = Random().nextInt(3)

  if (randomNumber === 1) {
    result = BigDecimal(30);
  } else {
    result = "Hello"
  }

  println("Result is $result")

  if (result is BigDecimal) {
    result = result.add(BigDecimal(30))
  } else {
    val tempResult = result as String
    result = tempResult.toUpperCase()
  }

  println("Result is $result")
}