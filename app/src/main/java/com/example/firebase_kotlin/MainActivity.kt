package com.example.firebase_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.firebase_kotlin.databinding.ActivityMainBinding
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
//    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

/*        binding.signup.setOnClickListener{
            val phone = binding.phone.text.toString()
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()

            database = FirebaseDatabase
                .getInstance("https://test-80749-default-rtdb.firebaseio.com/&quot;)
                    .reference.child("TEST_KEY")

                    val user = User(phone, email, password)

            database.child(password).setValue(user).addOnSuccessListener {
                binding.phone.text.clear()
                binding.email.text.clear()
                binding.password.text.clear()
            }.addOnFailureListener { print("Error") }
        }*/
    }
}