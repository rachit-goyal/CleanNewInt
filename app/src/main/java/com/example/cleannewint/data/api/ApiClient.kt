package com.example.cleannewint.data.api

import com.google.gson.JsonObject
import retrofit2.http.GET

interface ApiClient {
    @GET("api/users")
    suspend fun sampleGet(): JsonObject
}