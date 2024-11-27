package edu.iesam.examaad1eval.app.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.iesam.examaad1eval.features.ex2.data.local.db.GameEntity
import edu.iesam.examaad1eval.features.ex2.data.local.db.ModelsDao
import edu.iesam.examaad1eval.features.ex2.data.local.db.PlayerEntity

@Database(entities = [GameEntity::class, PlayerEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun modelsDao(): ModelsDao
}
