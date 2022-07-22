package com.example.diaryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth



class Signup : AppCompatActivity() {
    private lateinit var fullName: EditText
    private lateinit var userName: EditText
    private lateinit var password: EditText
    private lateinit var confirmPassword: EditText
    private lateinit var signup: Button
    private lateinit var login: TextView

    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        mAuth = FirebaseAuth.getInstance()

        fullName = findViewById(R.id.fullName)
        userName = findViewById(R.id.userName)
        password = findViewById(R.id.password)
        confirmPassword = findViewById(R.id.confirmPassword)
        login = findViewById(R.id.login)
        signup = findViewById(R.id.signup)
        login.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            signup.setOnClickListener {
                val userName = userName.text.toString()
                val password = password.text.toString()


                signup(userName, password)
            }
        }
    }

    private fun signup(userName: String, password: String) {
        mAuth.createUserWithEmailAndPassword(userName, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    //code for jumping home
                    val intent=Intent(this@Signup,MainActivity::class.java)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@Signup, "some error occurred", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
