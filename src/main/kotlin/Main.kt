package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello World")

    for (i in 1..10) {
        val j = i.toDouble() / 2
        val j1= j * 5
        println(j1.toDouble())
    }
    val j1= 50
    val i1= j1 / 2
    if (i1 == 0) {
        println("Incorrect")
    } else if (i1 < 40) {
        println("$i1, Perfect!")
    } else {
        println("Repeat the problem!")
    }
}




