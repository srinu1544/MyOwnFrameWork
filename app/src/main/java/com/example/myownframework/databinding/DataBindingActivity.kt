package com.example.myownframework.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myownframework.R

class DataBindingActivity : AppCompatActivity() {

    lateinit var binding : ActivityDataBindingBinding
    lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)
        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        binding.mcontext = this

        viewModel.imageUrl.value = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.istockphoto.com%2Fid%2F1146517111%2Fphoto%2Ftaj-mahal-mausoleum-in-agra.jpg%3Fs%3D612x612%26w%3D0%26k%3D20%26c%3DvcIjhwUrNyjoKbGbAQ5sOcEzDUgOfCsm9ySmJ8gNeRk%3D&tbnid=O5RXpwJLOupVkM&vet=12ahUKEwiV86qZ3PmBAxUUQWwGHRCICaUQMygJegUIARCIAQ..i&imgrefurl=https%3A%2F%2Fwww.istockphoto.com%2Fphotos%2Findia&docid=LOFnE7wghBVyxM&w=612&h=411&q=images&ved=2ahUKEwiV86qZ3PmBAxUUQWwGHRCICaUQMygJegUIARCIAQ"

        viewModel.editText.observe(this, Observer {
            Log.d("textwatcher",it)
        })

        viewModel.name.value = "srinivas"
        viewModel.btnText.value = "Ok"

    }
}