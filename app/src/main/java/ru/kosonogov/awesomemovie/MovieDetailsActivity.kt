package ru.kosonogov.awesomemovie

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kosonogov.awesomemovie.databinding.ActivityMovieDetailsBinding

class MovieDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}