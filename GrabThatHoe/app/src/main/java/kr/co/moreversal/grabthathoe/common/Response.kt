package kr.co.moreversal.grabthathoe.common

data class Response<T>(
    val status: Int,
    val message: String,
    val data: T
)