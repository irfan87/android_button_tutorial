package com.irfanshukri203.buttontutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnApply.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthdate.text.toString()
            val country = etCountry.text.toString()

            val toast = makeText(applicationContext, "The result is saved at the Logcat", Toast.LENGTH_LONG)

            Log.d(TAG, "First Name: $firstName, LastName: $lastName, Birth Date: $birthDate, Country: $country")
            toast.show()
        }
    }
}