package com.example.myownframework.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myownframework.R
import com.example.myownframework.databinding.ActivityViewBindingExBinding

class ViewBindingEx : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingExBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingExBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textview.text = "hello Android"

    }
}