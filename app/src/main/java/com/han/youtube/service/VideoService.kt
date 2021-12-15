package com.han.youtube.service

import com.han.youtube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/da6a9d79-0b09-484e-b7b0-b2efd77e50d4")
    fun listVideos(): Call<VideoDto>
}