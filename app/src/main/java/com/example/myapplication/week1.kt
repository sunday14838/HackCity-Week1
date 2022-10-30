package com.example.myapplication

fun  main(){
    val Number1 = 25
    val Number2 = 59
    val Number3 =45

    if (Number1>=Number2 || Number1>=Number3 ){
        println("Number1 is the biggest")
    }else if (Number2>= Number1  || Number2>=Number3 ){
        println("Number2 is the biggest")
    }else if (Number3>=Number1  || Number3>=Number2 ){
        println("Number3 is the biggest")
    }else{
        println("Error")
    }
}