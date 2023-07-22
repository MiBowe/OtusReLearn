package com.example.otusrelearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.otusrelearn.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        getFilms()
        setContentView(view)
    }
    private fun getFilms(){
        val film = intent.getIntExtra("key",0)
        when(film){
            1-> {
                binding.imageView.setImageDrawable(getDrawable(R.drawable.poster1))
                binding.filmTitle.text = getText(R.string.film1)
                binding.filmDetails.text = getText(R.string.film1details)
            }
            2-> {binding.imageView.setImageDrawable(getDrawable(R.drawable.poster2))
                binding.filmTitle.text = getText(R.string.film2)
                binding.filmDetails.text = getText(R.string.film2details)
            }
        }
    }
}