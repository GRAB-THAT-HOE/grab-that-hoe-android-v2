package kr.co.moreversal.grabthathoe.feature_post.data.remote.dto

import kr.co.moreversal.grabthathoe.feature_post.domain.model.Posting
import java.time.LocalDateTime

data class PostingDto(
    val id: String,
    val title: String,
    val image: String,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    val farmer: Farmer
)


fun PostingDto.toPosting(): Posting {
    return Posting(
        id = id,
        title = title,
        image = image,
        startDate = startDate,
        endDate = endDate,
        farmer = farmer
    )
}