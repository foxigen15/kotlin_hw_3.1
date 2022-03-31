package ru.netology

class VideoAttachment(
        override val type: String = "video",
        val video: Video
) : Attachments