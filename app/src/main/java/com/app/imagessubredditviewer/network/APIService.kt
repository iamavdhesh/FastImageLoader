package com.app.imagessubredditviewer.network

import com.app.imagessubredditviewer.models.RedditResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("/r/images/hot.json")
    suspend fun getListing(): Response<RedditResponseModel>
}