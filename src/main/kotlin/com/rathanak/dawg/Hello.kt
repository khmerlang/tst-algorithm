package com.rathanak.dawg

fun main() {
    println("Hello")
    var tst = TST()
    tst.put("hello", 1)
    tst.put("how", 2)

    println("hello: " + tst.get("hello").toString())
    println("hell: " + tst.get("hell").toString())
}