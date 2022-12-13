package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var password : EditText
    private lateinit var email : EditText
    private lateinit var Button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        password=findViewById(R.id.password)
        email=findViewById(R.id.email)
        Button=findViewById(R.id.Button)

        Button.setOnClickListener {

            var pass = password.text.toString()
            var email = email.text.toString()

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this){ task ->
                    if(task.isSuccessful){
                        Toast.makeText(this, "warmatebit sheiqmna !", Toast.LENGTH_SHORT).show()

                    }

                }
        }

    }
}