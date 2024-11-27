package edu.iesam.examaad1eval.features.ex2.data.local.db

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import edu.iesam.examaad1eval.features.ex2.domain.Game
import edu.iesam.examaad1eval.features.ex2.domain.Player

class GameMapper {


    fun toEntity(game: Game): GameEntity {
        return GameEntity(
            id = game.id,
            title = game.title,
            player = game.player.toString()

        )
    }

    fun toGame(entity: GameEntity): Game {
        val gson = Gson()
        val playerList: List<Player> = gson.fromJson(
            entity.player, object : TypeToken<List<Player>>() {}.type
        )
        return Game(
            id = entity.id,
            title = entity.title,
            player = playerList
        )
    }
}