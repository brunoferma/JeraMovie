package com.example.jeramovies.repository

import com.example.jeramovies.model.Movie
import com.example.jeramovies.retrofit.APIService.API_KEY
import com.example.jeramovies.retrofit.APIService.LANGUAGE
import com.example.jeramovies.retrofit.APIService.retrofit
import com.example.jeramovies.retrofit.MoviesService

class MoviesRepository {

        fun getMovies(): List<Movie> {
            val moviesService = retrofit.create(MoviesService::class.java)
            val result = moviesService?.getMovies(API_KEY, LANGUAGE)?.execute()
            val moviesList: ArrayList<Movie> = arrayListOf()
            if (result != null && result.isSuccessful) {
                result.body()?.results?.forEach { moviesResponse ->
                    val movies = Movie()
                    movies.title = moviesResponse.title ?: ""
                    movies.posterPath = moviesResponse.posterPath ?: ""
                    movies.backdropPath = moviesResponse.backdropPath ?: ""
                    movies.overview = moviesResponse.overview ?: ""
                    movies.releaseDate = moviesResponse.releaseDate?: ""
                    movies.voteAverage = moviesResponse.voteAverage ?: ""
                    movies.popularity = moviesResponse.popularity ?: ""

                    moviesList.add(movies)

                }
            }
            return moviesList
        }
    }