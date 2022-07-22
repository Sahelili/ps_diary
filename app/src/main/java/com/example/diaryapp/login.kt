package com.example.diaryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var password: EditText
    private lateinit var login: Button
    private lateinit var signup: TextView


    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mAuth = FirebaseAuth.getInstance()


        userName = findViewById(R.id.userName)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        signup = findViewById(R.id.signup)
        signup.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)

        }
        login.setOnClickListener {
            val userName = userName.text.toString()
            val password = password.text.toString()

            login(userName, password)
        }
    }

    private fun login(userName: String, password: String) {
//logic for logging user
        mAuth.signInWithEmailAndPassword(userName, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent=Intent(this@Login, MainActivity::class.java)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@Login,"worng password or userName",Toast.LENGTH_SHORT).show()
                }
            }
    }
}

