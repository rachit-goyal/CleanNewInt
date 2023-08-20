package com.example.cleannewint.domain.useCase

import com.example.cleannewint.data.repository.UserRepository
import com.google.gson.JsonObject
import javax.inject.Inject

class UserUseCase @Inject constructor(private val repository: UserRepository) {
    suspend fun getData():JsonObject {
        return repository.getData()
    }
}