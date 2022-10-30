package com.example.myapplication

fun  main(){
    var week1b= "ADE"
    when(week1b){
        in "A".."Z" -> println("Yes,$week1b it an alphabet")
        else -> println("No, $week1b is not an alphabet")
    }
}