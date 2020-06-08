package com.rathanak.dawg

class TST {
    var root: Node? = null

    fun put(key: String, value: Int) {
        root = addNode(root, key, value, 0)
    }

    fun get(key: String): Int {
        val tmp = getNode(root, key, 0) ?: return 0

        return tmp.value
    }

    private fun getNode(x: Node?, key: String, d: Int): Node? {
        if(x == null) {
            return null
        }
        val ch = key[d]

        return if (ch < x.ch) {
            getNode(x.left, key, d)
        } else if (ch > x.ch) {
            getNode(x.right, key, d)
        } else if (d < key.length - 1) {
            getNode(x.mid, key, d+1)
        } else {
            x
        }
    }

    private fun addNode(x: Node?, key: String, value: Int, d: Int ): Node? {
        var tmpRoot = x
        val ch = key[d]
        if(tmpRoot == null) {
            tmpRoot = Node()
            tmpRoot.ch = ch
        }
        if(ch < tmpRoot.ch) {
            tmpRoot.left = addNode(tmpRoot.left, key, value, d)
        } else if(ch > tmpRoot.ch) {
            tmpRoot.right = addNode(tmpRoot.right, key, value, d)
        } else if(d < key.length -1) {
            tmpRoot.mid = addNode(tmpRoot.mid, key, value, d+1)
        } else {
            tmpRoot.value = value
        }

        return tmpRoot
    }
}