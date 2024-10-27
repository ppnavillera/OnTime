package com.example.ontime

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ontime.databinding.ActivityLoginBinding
import com.example.ontime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpButton.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java) // SignUpActivity로 이동하는 Intent 생성
            startActivity(intent) // 액티비티 시작
        }
    }
}
