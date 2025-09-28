package com.example.lab_week_05.api
import com.example.lab_week_05.ImageData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CatApiService {
    @GET("images/search")
    fun searchImages(
        @Query("limit") limit: Int,
        @Query("size") format: String,
        @Query("include_breeds") includeBreeds: Boolean = true
    ) : Call<List<ImageData>>
}
