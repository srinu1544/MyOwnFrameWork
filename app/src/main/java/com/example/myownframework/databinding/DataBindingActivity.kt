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
        //setContentView(R.layout.activity_data_binding)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)
        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        binding.mcontext = this

        viewModel.imageUrl.value = "https://www.google.com/search?sca_esv=573619808&rlz=1C1CHBF_enIN1066IN1068&sxsrf=AM9HkKlN2Zja8hlcO7ZgpoYNrSgATStXHA:1697387421988&q=images&tbm=isch&source=lnms&sa=X&ved=2ahUKEwidrdXyvPiBAxUGQt4KHZRYCikQ0pQJegQICRAB&biw=1280&bih=563&dpr=1.5#imgrc=fY9reP86COngJM"


        viewModel.editText.observe(this, Observer {
            Log.d("textwatcher",it)
        })

        viewModel.name.value = "srinivas"
        viewModel.btnText.value = "Ok"



    }
}