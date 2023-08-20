package com.example.cleannewint.data.repository

import com.example.cleannewint.data.api.ApiClient
import com.google.gson.JsonObject
import javax.inject.Inject

class UserRepository @Inject constructor(val apiClient: ApiClient) {

    suspend fun getData():JsonObject {
       return apiClient.sampleGet()
    }
}