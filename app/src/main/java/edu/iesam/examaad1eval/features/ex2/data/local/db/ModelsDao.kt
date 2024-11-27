package edu.iesam.examaad1eval.features.ex2.data.local.db

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface ModelsDao {
    @Insert
    fun insertAllGames(vararg gameEntity: GameEntity)

    @Insert
    fun insertAllPlayers(vararg playerEntity: PlayerEntity)
}