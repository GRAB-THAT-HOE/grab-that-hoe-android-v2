package kr.co.moreversal.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import kr.co.moreversal.data.local.entity.SampleEntity

@Dao
interface SampleDao {
    @Insert
    suspend fun sampleInsert(entity: SampleEntity)
}
