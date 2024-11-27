package edu.iesam.examaad1eval

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.examaad1eval.features.ex1.data.Ex1DataRepository
import edu.iesam.examaad1eval.features.ex1.data.local.Ex1XmlLocalDataSource
import edu.iesam.examaad1eval.features.ex1.data.remote.MockEx1RemoteDataSource
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        executeExercise1()
        executeExercise2()
    }

    private fun executeExercise1() {
        val dataRepository =
            Ex1DataRepository(Ex1XmlLocalDataSource(this), MockEx1RemoteDataSource())
        Log.d("@dev", dataRepository.getUsers().toString())
        Log.d("@dev", "${dataRepository.getItems()}")
        Log.d("@dev", "${dataRepository.getServices()}")
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun executeExercise2() {
        //Ejecutar el ejercicio 2 desde aquí llamando al Ex2DataRepository directamente
        GlobalScope.launch {
            //llamar a Room
        }
    }
}