package ru.netology

class AudioAttachment(
        override val type: String = "audio",
        val audio: Audio
) : Attachments