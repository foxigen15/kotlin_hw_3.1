package ru.netology

class DocAttachment(
        override val type: String = "doc",
        val doc: Doc
) : Attachments