package com.example.displayimageresourses

import android.graphics.drawable.Drawable
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
            displayImageAsset("monster01.webp")
        }
        binding.button2.setOnClickListener {
            displayImageAsset("monster02.webp")

        }
        binding.button3.setOnClickListener {
            displayImageAsset("monster03.webp")

        }
    }

//    private fun displayImageResource(resId: Int) {
//        binding.monsterImage.setImageResource(resId)
//    }

    private fun displayImageAsset(fileName: String) {
        assets.open(fileName).use {
            val drawable = Drawable.createFromStream(it, null)
            binding.monsterImage.setImageDrawable(drawable)
        }

    }
}

