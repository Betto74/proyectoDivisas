package com.example.proyectodivisas.retrofit



import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ExchangeRateService {

    @GET("v6/dcfac1af294ba5c24872e6b9/latest/{baseCode}")
    suspend fun getLatestRates(@Path("baseCode") baseCode: String): Response<ExchangeRateResponse>
}