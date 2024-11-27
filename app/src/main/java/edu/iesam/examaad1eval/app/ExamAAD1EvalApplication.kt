package edu.iesam.examaad1eval.app

import android.app.Application
import androidx.room.Room
import edu.iesam.examaad1eval.app.data.local.db.AppDatabase
import edu.iesam.examaad1eval.features.ex2.data.local.db.Ex2DbLocalDataSource

class ExamAAD1EvalApplication : Application() {
    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "ex2-db"
        ).build()
    }
}