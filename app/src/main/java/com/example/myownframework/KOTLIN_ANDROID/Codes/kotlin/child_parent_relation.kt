package com.example.myownframework.KOTLIN_ANDROID.Codes.kotlin

data class Node(val id: String, val parentId: String?, val children: MutableList<Node> = mutableListOf())

fun buildTree(nodes: List<Node>): List<Node> {
    val nodeMap = nodes.associateBy { it.id }.toMutableMap()
    val roots = mutableListOf<Node>()

    nodes.forEach { node ->
        if (node.parentId == null) {
            roots.add(node)
        } else {
            val parent = nodeMap[node.parentId]
            parent?.children?.add(node)
        }
    }

    return roots
}

fun printTree(node: Node, level: Int = 1, prefix: String = "") {
    println("$prefix${node.id}")
    node.children.forEachIndexed { index, child ->
        val newPrefix = "$prefix$level.${index + 1} "
        printTree(child, level + 1, newPrefix)
    }
}

fun main() {
    val data = listOf(
        Node("MR0001", null),
        Node("MR0002", "MR0001"),
        Node("MR0003", "MR0002"),
        Node("MR0004", "MR0003"),
        Node("MR0005", "MR0002"),
        Node("MR0006", null),
        Node("MR0007", "MR0001"),
        Node("MR0008", null),
        Node("MR0009", "MR0006"),
        Node("MR0010", "MR0007")
    )

    val tree = buildTree(data)
    tree.forEachIndexed { index, node ->
        printTree(node, index + 1, "${index + 1}.  ")
    }
}


/*
1.  MR0001
1.1 MR0002
1.1.1 MR0003
1.1.1.1 MR0004
1.1.2 MR0005
1.2 MR0007
1.2.1 MR0010
2.  MR0006
2.1 MR0009
3.  MR0008
*/