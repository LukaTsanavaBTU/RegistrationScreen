package com.example.filloutform

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etName : EditText
    private lateinit var etSurname : EditText
    private lateinit var etEmail : EditText
    private lateinit var etPassword : EditText
    private lateinit var checkbox : CheckBox



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        etName = findViewById(R.id.etName)
        etSurname = findViewById(R.id.etSurname)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        checkbox = findViewById(R.id.checkbox)

        }

    fun register(clickedView: View) {

        var allowedToRegister = true

        if (etName.text.toString() == "") {

            Toast.makeText(applicationContext,"გთხოვთ შეიყვანოთ თქვენი სახელი", Toast.LENGTH_LONG).show()

        }

        else if (etSurname.text.toString() == "") {

            Toast.makeText(applicationContext,"გთხოვთ შეიყვანოთ თქვენი გვარი", Toast.LENGTH_LONG).show()

        }

        else if ((etEmail.text.toString() == "") or ("@" !in etEmail.text.toString()) or ("." !in etEmail.text.toString())) {

            Toast.makeText(applicationContext,"გთხოვთ სწორად შეიყვანოთ თქვენი მეილი", Toast.LENGTH_LONG).show()

        }

        else if (etPassword.text.toString() == "") {

            Toast.makeText(applicationContext,"გთხოვთ შეიყვანოთ თქვენი პაროლი", Toast.LENGTH_LONG).show()

        }

        else if (etPassword.text.toString().length < 8) {

            Toast.makeText(applicationContext,"პაროლი უნდა შედგებოდეს მინიმუმ 8 სიმბოლოსგან", Toast.LENGTH_LONG).show()

        }

         else if (!checkbox.isChecked) {

            Toast.makeText(applicationContext,"თქვენ არ დათანხმებულხართ წესებს და პირობებს", Toast.LENGTH_LONG).show()

        }

        else {

            Toast.makeText(applicationContext,"თქვენ წარმატებით გაიარეთ რეგისტრაცია!", Toast.LENGTH_LONG).show()

        }


    }

    }










