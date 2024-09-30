package com.example.showip

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("d4e2bt6jba6cmiekqmsv/")
    suspend fun getCurrentIp(): Response<IpResponse>
}