package com.example.myownframework.Kotlin_Android.permissions.NonCompose

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import com.example.myownframework.R

class PerNonCompose : AppCompatActivity() {


    private val STORAGE_PERMISSION  =  Manifest.permission.WRITE_EXTERNAL_STORAGE
    private val FOREGROUNG_LOACTION = Manifest.permission.ACCESS_COARSE_LOCATION
    private val BACKGROUND_LOCATION = Manifest.permission.ACCESS_BACKGROUND_LOCATION

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions_non_compose)
        requestPermissions()
    }


    private fun hasPermission(permissionType : String) =
        ActivityCompat.checkSelfPermission(this, permissionType) == PackageManager.PERMISSION_GRANTED



    private fun requestPermissions(){
        var permissionToRequest = mutableListOf<String>()
        if (!hasPermission(STORAGE_PERMISSION)){
            permissionToRequest.add(STORAGE_PERMISSION)
        }
        if (!hasPermission(FOREGROUNG_LOACTION)){
            permissionToRequest.add(FOREGROUNG_LOACTION)
        }
        if (!hasPermission(BACKGROUND_LOCATION)){
            permissionToRequest.add(BACKGROUND_LOCATION)
        }

        if (permissionToRequest.isNotEmpty()){
            ActivityCompat.requestPermissions(this,permissionToRequest.toTypedArray(),0)
        }


    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 0 && grantResults.isNotEmpty()){
            for (i in grantResults.indices){
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED){
                    Log.i("permissionsRequest", "${permissions[i]} granted")
                }

            }
        }

    }


}