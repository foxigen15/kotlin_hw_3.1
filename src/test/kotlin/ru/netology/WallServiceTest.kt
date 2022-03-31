package ru.netology

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun restoreForAdd() {
        WallService.removeAll()
    }

    @Test
    fun add() {
        val addedPost = WallService.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Какой-то текст",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1,
                indexPosts = 0
            )
        )

        val result = addedPost.indexPosts > 0
        assertTrue(result)

    }

    @Before
    fun restoreForUpdatePosyIsFound() {
        WallService.removeAll()
    }

    @Test
    fun updatePosyIsFound() {
        WallService.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Какой-то текст 1",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1,
                indexPosts = 0
            )
        )

        WallService.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Какой-то текст 2",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1,
                indexPosts = 0
            )
        )

        val updatedPost = WallService.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Новый текст для поста",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1,
                indexPosts = 0
            )
        )
        val result = WallService.update(updatedPost)
        assertTrue(result)
    }

    @Before
    fun restoreForUpdatePosyIsNotFound() {
        WallService.removeAll()
    }

    @Test
    fun updatePosyIsNotFound() {
        WallService.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Какой-то текст 1",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1,
                indexPosts = 0
            )
        )

        WallService.add(
            Post(
                id = 2,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Какой-то текст 2",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1,
                indexPosts = 0
            )
        )

        val updatedPost =
            Post(
                id = 3,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "Новый текст для поста",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = null,
                copyright = "1",
                likes = null,
                reposts = null,
                views = null,
                postType = "1",
                postSource = null,
                attachments = null,
                geo = null,
                signerId = 1,
                copyHistory = null,
                postponedId = 1,
                indexPosts = 0
            )

        val result = WallService.update(updatedPost)
        assertFalse(result)
    }

}