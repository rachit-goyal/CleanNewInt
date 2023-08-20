package com.example.cleannewint.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.cleannewint.R
import com.example.cleannewint.databinding.ActivityMainBinding
import com.example.cleannewint.presentation.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getData()
        viewModel.data.observe(this){
            Log.d("value", it.toString());
        }
    }
}