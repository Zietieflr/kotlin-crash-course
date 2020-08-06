package com.tutorials.tutorial1

fun main() {
    // TODO: Can now jump to this file from the TODO menu
    var myName = "Denis"
//    var lastCharacter = myName[-1] THIS WILL NOT WORK
    var lastCharacter = myName[myName.length - 1]
    print("Last Character: " + lastCharacter)

    var age = 21
    when(age) {
        !in 0..20 -> println("Now you may drink in the US.")
        in 18..20 -> println("You may now vote.")
        16, 17 -> println("You may drive now.")
        else -> println("You're to young.")
    }

    var x : Any = 13.37
    when (x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    var number = 100
    while(number >= 0) {
        print("$number")
        number -= 2
    }

    for(i in 10 downTo 1 step 2) {
        print("\n$i ")
    }

    myFunction()
    var result = addUp(5,3)
    println("result is $result")
    var avg = average(4,13)
    println("result is $avg") 
}

fun myFunction(){
    println("\nCalled from myFunction")
}

fun addUp(a: Int, b: Int) : Int{
    return a+b
}

fun average(a: Int, b: Int) : Double {
    return addUp(a, b)/2.toDouble()
}