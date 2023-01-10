package kr.co.moreversal.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import kr.co.moreversal.data.local.dao.SampleDao
import kr.co.moreversal.data.local.entity.SampleEntity

@Database(
    entities = [SampleEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun sampleDao(): SampleDao
}