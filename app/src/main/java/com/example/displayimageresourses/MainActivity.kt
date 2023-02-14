package com.example.displayimageresourses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.displayimageresourses.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button1.setOnClickListener {
            displayImageResource(R.drawable.monster01)
        }
        binding.button2.setOnClickListener {
            displayImageResource(R.drawable.monster02)
        }
        binding.button3.setOnClickListener {
            displayImageResource(R.drawable.monster03)
        }
    }

    private fun displayImageResource(resId: Int) {
        binding.monsterImage.setImageResource(resId)
    }
}

