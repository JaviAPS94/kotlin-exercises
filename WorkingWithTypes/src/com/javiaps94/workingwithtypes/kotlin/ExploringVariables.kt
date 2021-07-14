package com.javiaps94.workingwithtypes.kotlin

fun main(args: Array<String>) {
  var name = "Alex"
  val surname = "Pinaida"

  println("Hello $name ${surname.toUpperCase()}")
  println("Your first name has ${name.length} characters")
  println("Your product cost \$about10")

  val story = """It was a dark and story night.
    |Jane wondered what time it was.""".trimMargin("|")

  println(story)

  val changeStory = story.replaceAfterLast("it", " would be done")

  println(changeStory)
}