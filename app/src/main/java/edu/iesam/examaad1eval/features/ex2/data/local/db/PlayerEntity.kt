package edu.iesam.examaad1eval.features.ex2.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

private const val TABLE_NAME = "player"

@Entity(tableName = TABLE_NAME)
data class PlayerEntity(
    @PrimaryKey val id: String,
    @ColumnInfo val name: String,
)