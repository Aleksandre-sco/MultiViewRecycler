package com.codingwithme.multiviewrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity2 : AppCompatActivity() {

    private lateinit var inputEmail: EditText
    private lateinit var inputPassword: EditText
    private lateinit var enterButton: Button
    private lateinit var registrationButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mAuth = FirebaseAuth.getInstance()

        if (mAuth.currentUser != null){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        setContentView(R.layout.activity_main2)

        inputEmail = findViewById(R.id.emailview)
        inputPassword = findViewById(R.id.passwordview)
        enterButton = findViewById(R.id.enterbutton)
        registrationButton = findViewById(R.id.registrationbutton)

        enterButton.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "ცარიელია", Toast.LENGTH_SHORT).show()
            } else {
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { aleks ->
                    if (aleks.isSuccessful) {
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    } else{
                        Toast.makeText(this, "შეცდომა", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

        registrationButton.setOnClickListener {
            startActivity(Intent(this, register::class.java))
        }

    }
}