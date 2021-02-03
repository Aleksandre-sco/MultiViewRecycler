package com.codingwithme.multiviewrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    private lateinit var inputEmail: EditText
    private lateinit var inputPassword: EditText
    private lateinit var registrationButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mAuth = FirebaseAuth.getInstance()

        inputEmail = findViewById(R.id.emailview2)
        inputPassword = findViewById(R.id.passwordview2)
        registrationButton = findViewById(R.id.registrationbutton2)

        registrationButton.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "ცარიელია", Toast.LENGTH_SHORT).show()
            } else {
                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { aleksa ->
                    if (aleksa.isSuccessful) {
                        startActivity(Intent(this, MainActivity2::class.java))
                        finish()
                    } else{
                        Toast.makeText(this, "შეცდომა!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
         }
    }
}