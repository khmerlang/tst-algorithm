package com.rathanak.dawg

import java.io.File

class WordTree {
    fun createNode(tst: TST): Node? {
//        val filePath = object {}.javaClass.getResource("/count_1w.txt").path
        val filePath = object {}.javaClass.getResource("/words.txt").path
        File(filePath).useLines { lines ->
            lines.forEach {
                val token = it.split("\\s".toRegex())
                if (token.size == 2) {
                    tst.insert(token[0], token[1])
                }
            }
        }

        return tst.root
    }
}