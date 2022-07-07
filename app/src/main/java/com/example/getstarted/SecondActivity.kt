package com.example.getstarted

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.getstarted.databinding.ActivityMainBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setContentView(binding.root)

        signup()

    }

    private fun signup() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}