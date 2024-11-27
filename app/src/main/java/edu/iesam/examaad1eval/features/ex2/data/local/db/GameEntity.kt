package edu.iesam.examaad1eval.features.ex2.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

private const val GAME_TABLE_NAME = "Game"

@Entity(tableName = GAME_TABLE_NAME)
data class GameEntity(
    @PrimaryKey val id: String,
    @ColumnInfo val title: String,
    @Embedded val player: String
)