package ru.kosonogov.awesomemovie.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.kosonogov.awesomemovie.R
import ru.kosonogov.awesomemovie.databinding.FragmentMovieListBinding


class FragmentMovieList : Fragment() {

    private var binding: FragmentMovieListBinding? = null

    private var clickListener: FragmentMovieClickListener? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieListBinding.bind(view)
        binding!!.cardMovie.setOnClickListener {
            clickListener?.clickMovie()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentMovieClickListener) {
            clickListener = context
        }

    }

    override fun onDetach() {
        super.onDetach()
        clickListener = null
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    interface FragmentMovieClickListener {
        fun clickMovie()
    }
}