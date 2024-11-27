package edu.iesam.examaad1eval.features.ex2.data.local.db

import edu.iesam.examaad1eval.features.ex2.domain.Player

class PlayerMapper {

    fun toEntity(player: Player): PlayerEntity {
        return PlayerEntity(
            id = player.id,
            name = player.name
        )
    }

    fun toPlayer(entity: PlayerEntity): Player {
        return Player(
            id = entity.id,
            name = entity.name
        )
    }
}