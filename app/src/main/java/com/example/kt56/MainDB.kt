package com.example.kt56

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Todos::class], version = 1)
abstract class MainDB : RoomDatabase() {

    abstract fun getDao(): TodosDao

    companion object {
        fun getDb(context: Context): MainDB {
            return Room.databaseBuilder(
                context.applicationContext,
                MainDB::class.java,
                "app_database.db"
            ).build()
        }
    }
}