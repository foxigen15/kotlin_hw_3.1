package ru.netology

class Link(
        val url: String,
        val title: String,
        val caption: String,
        val description: String,
        val photo: Photo?,
        val product: Any?,
        val button: Any?,
        val previewPage: String,
        val previewUrl: String
)