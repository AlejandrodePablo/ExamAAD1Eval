package edu.iesam.examaad1eval.features.ex1.data.local

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import edu.iesam.examaad1eval.features.ex1.domain.Item
import edu.iesam.examaad1eval.features.ex1.domain.Services
import edu.iesam.examaad1eval.features.ex1.domain.User

class Ex1XmlLocalDataSource(private val context: Context) {
    private val gson = Gson()
    private val sharedPref = context.getSharedPreferences("db-exam", Context.MODE_PRIVATE)

    fun saveUsers(users: List<User>) {
        val usersJson = gson.toJson(users)
        sharedPref.edit().putString("users", usersJson).apply()
    }

    fun saveItems(items: List<Item>) {
        val itemsJson = gson.toJson(items)
        sharedPref.edit().putString("items", itemsJson).apply()
    }

    fun saveServices(services: List<Services>) {
        val servicesJson = gson.toJson(services)
        sharedPref.edit().putString("services", servicesJson).apply()
    }

    fun getUsers(): List<User> {
        val usersJson = sharedPref.getString("users", null)
        return if (usersJson != null) {
            gson.fromJson(usersJson, object : TypeToken<List<User>>() {}.type)
        } else {
            emptyList()
        }
    }

    fun getItems(): List<Item> {
        val itemsJson = sharedPref.getString("items", null)
        return if (itemsJson != null) {
            gson.fromJson(itemsJson, object : TypeToken<List<Item>>() {}.type)
        } else {
            emptyList()
        }
    }

    fun getServices(): List<Services> {
        val servicesJson = sharedPref.getString("services", null)
        return if (servicesJson != null) {
            gson.fromJson(servicesJson, object : TypeToken<List<Services>>() {}.type)
        } else {
            emptyList()
        }
    }
}