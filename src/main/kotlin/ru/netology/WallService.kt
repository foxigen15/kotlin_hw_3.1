package ru.netology

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
