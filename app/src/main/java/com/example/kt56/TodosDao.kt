package com.example.kt56

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TodosDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(todos: Todos)

    @Query("SELECT * FROM todos")
    suspend fun getAllTodos(): List<Todos>
}