package com.example.cleannewint.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleannewint.domain.useCase.UserUseCase
import com.google.gson.JsonObject
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val useCase: UserUseCase)  :ViewModel() {

    val data=MutableLiveData<JsonObject>()


    fun getData() {
        viewModelScope.launch {
            val response = useCase.getData()
            data.postValue(response)
        }
    }

}