package kr.co.moreversal.grabthathoe.feature_post.data.remote.dto

import java.time.LocalDateTime

data class Farmer(
    val phone: Int,
    val permission: Int,
    val name: String,
    val birthDate: LocalDateTime,
    val avatar: String
)
