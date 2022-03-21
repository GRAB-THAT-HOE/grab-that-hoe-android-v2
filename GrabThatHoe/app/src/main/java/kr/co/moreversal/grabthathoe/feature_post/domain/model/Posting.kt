package kr.co.moreversal.grabthathoe.feature_post.domain.model

import kr.co.moreversal.grabthathoe.feature_post.data.remote.dto.Farmer
import java.time.LocalDateTime

data class Posting(
    val id: String,
    val title: String,
    val image: String,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    val farmer: Farmer
)
