package ru.netology

import ru.netology.WallService.posts

fun main() {
}

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += if (posts.isEmpty()) post.copy(indexPosts = 1) else post.copy(indexPosts = posts.last().indexPosts + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postForSearch) in posts.withIndex()) {
            if (postForSearch.id == post.id) {
                posts[index] =
                    post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                return true
            }
        }
        return false
    }

    fun removeAll() {
        posts = emptyArray()
    }
}

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Any?,
    val copyright: String,
    val likes: Any?,
    val reposts: Any?,
    val views: Any?,
    val postType: String = "post",
    val signerId: Int,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val postponedId: Int,
    val indexPosts: Int = 0
) {

}