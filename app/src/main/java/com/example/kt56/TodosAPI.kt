package com.example.kt56

import retrofit2.http.GET
import retrofit2.http.Path

interface TodosAPI {

    @GET("todos/{id}")

    suspend fun getTodosById(@Path("id") id: Int): Todos

}