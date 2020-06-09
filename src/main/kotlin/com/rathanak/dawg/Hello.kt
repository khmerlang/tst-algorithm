package com.rathanak.dawg

import java.io.File

fun main() {
    println("Hello")
    var spellCorrector = SpellCorrector()
    println(spellCorrector.correct("i"))
    println(spellCorrector.correct("hi"))
    println(spellCorrector.correct("hiiiii"))
    println(spellCorrector.correct("hiiiiiiiiiiiiiii"))
}