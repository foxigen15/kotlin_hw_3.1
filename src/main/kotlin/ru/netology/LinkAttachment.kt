package ru.netology

class LinkAttachment(
        override val type: String = "link",
        val link: Link
) : Attachments