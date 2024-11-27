package edu.iesam.examaad1eval.features.ex2.data.local.db

import edu.iesam.examaad1eval.features.ex2.domain.Game

class Ex2DbLocalDataSource(private val modelsDao: ModelsDao) {

    fun getGamesList() {
        return modelsDao.insertAllGames()
    }

    fun getPLayersList() {
        return modelsDao.insertAllPlayers()

    }
}