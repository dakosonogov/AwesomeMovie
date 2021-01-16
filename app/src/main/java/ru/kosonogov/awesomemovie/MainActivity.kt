package ru.kosonogov.awesomemovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ru.kosonogov.awesomemovie.databinding.ActivityMainBinding
import ru.kosonogov.awesomemovie.fragments.FragmentMovieDetails
import ru.kosonogov.awesomemovie.fragments.FragmentMovieList

class MainActivity : AppCompatActivity(), FragmentMovieList.FragmentMovieClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       supportFragmentManager.beginTransaction()
           .add(R.id.main_container, FragmentMovieList())
           .commit()
    }

    override fun clickMovie() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_container, FragmentMovieDetails())
                .addToBackStack(null)
                .commit()
        }
    }
}