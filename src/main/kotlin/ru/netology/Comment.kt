package ru.netology

data class Comment {
    val id: Int,
    val fromId: Int,
    val postId: Int,
    val date: Int,
    val text: String,
    val replayToUser: Int? = null,
    val replayToComment: Int? = null,
    val attachments: Attachments? = null,
    val parentsStack: Array<Int>? = null,
    val thread: Thread? = null
}