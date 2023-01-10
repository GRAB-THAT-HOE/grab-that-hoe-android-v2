package kr.co.moreversal.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sample_table")
data class SampleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String
)
