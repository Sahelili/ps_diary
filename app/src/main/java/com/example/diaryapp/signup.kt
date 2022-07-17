package com.example.diaryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.diaryapp.ui.fragments.createNote
import com.google.firebase.auth.FirebaseAuth


class signup:  AppCompatActivity(){
    private lateinit var fullName: EditText
    private lateinit var userName: EditText
    private lateinit var password: EditText
    private lateinit var confirmPassword: EditText
    private lateinit var signup: Button
    private lateinit var login : TextView

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        mAuth = FirebaseAuth.getInstance()

        fullName=findViewById(R.id.fullName)
        userName=findViewById(R.id.userName)
        password=findViewById(R.id.password)
        confirmPassword=findViewById(R.id.confirmPassword)
        login=findViewById(R.id.login)
        signup=findViewById(R.id.signup)
        login.setOnClickListener {
            val intent = Intent(this, com.example.diaryapp.login::class.java)
            startActivity(intent)
            signup.setOnClickListener {
                val userName = userName.text.toString()
                val password = password.text.toString()

                signup(userName,password);
            }
        }

        private fun signup(userName: String, password: String){
            //logic of creating user
            mAuth.createUserWithEmailAndPassword(userName, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {

                        val intent = Intent(this@signup, createNote::class.java)
                        startActivity(intent)
                    }
                    else {
                       Toast.makeText(this@signup, "some error occured", Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }

}