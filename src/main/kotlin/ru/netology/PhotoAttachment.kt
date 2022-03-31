package ru.netology

class PhotoAttachment(
        override val type: String = "photo",
        val photo: Photo
        ) : Attachments