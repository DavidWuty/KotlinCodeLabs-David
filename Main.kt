package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>,) {
    println("Hello, User!")

    val isUnit = println("Welcome to Kotlin")
    println(isUnit)

    val lemons = 51
    val isAlot = if (lemons > 50) true else false
    println("$isAlot, you have too much lemons")

    val homework = 10
    val message = "The quantity of work is ${ if (homework > 50) "too much" else "OK" }."
    println(message)
}