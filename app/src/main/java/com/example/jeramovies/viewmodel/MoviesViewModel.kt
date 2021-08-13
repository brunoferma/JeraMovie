package com.example.jeramovies.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jeramovies.model.Movie
import com.example.jeramovies.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel(){

    private var moviesRepository : MoviesRepository = MoviesRepository()

    private val moviesList: MutableLiveData<List<Movie>> = MutableLiveData()

    fun getMovies() {
        viewModelScope.launch (Dispatchers.IO){
            moviesList.postValue(moviesRepository.getMovies())
        }
    }
    fun observeMovies(
        lifecycleOwner: LifecycleOwner,
        action: (List<Movie>) -> Unit
    ) = moviesList.observe(lifecycleOwner, { action(it)})
}