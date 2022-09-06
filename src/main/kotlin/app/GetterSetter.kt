package app

import data.BigTitle
import data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)

    note.title = ""

    println(note.title)

    val bigtitle = BigTitle("Belajar Kotlin")
    println(bigtitle.bigTitle)
}