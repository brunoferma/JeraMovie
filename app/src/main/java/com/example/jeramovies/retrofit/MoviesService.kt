package com.example.jeramovies.retrofit

import retrofit2.http.GET
import retrofit2.http.Query
import com.example.jeramovies.response.MoviesListResponse

interface MoviesService {
   @GET("3/trending/movie/week?")
   fun getMovies(@Query("api_key") key: String,
                 @Query ("language") language: String):
           retrofit2.Call<MoviesListResponse>
}