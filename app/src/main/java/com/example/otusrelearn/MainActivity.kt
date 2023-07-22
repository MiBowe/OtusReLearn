package com.example.otusrelearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.otusrelearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        buttons()
        setContentView(view)
    }
    private fun buttons(){
        binding.buttonFirstPoster.setOnClickListener{
            binding.buttonFirstPoster.setTextColor(getColor(R.color.purple_200))
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", 1)
            startActivity(intent)
        }
        binding.buttonSecondPoster.setOnClickListener{
            binding.buttonSecondPoster.setTextColor(getColor(R.color.purple_200))
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", 2)
            startActivity(intent)
        }
    }
}