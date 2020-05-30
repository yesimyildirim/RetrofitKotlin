package com.yesimyildirim.retrofitkotlin.service

import com.yesimyildirim.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface CryptoAPI {

    //https://api.nomics.com/v1/prices?key=0944af813ad7251af5c017dd8e1d0729

    @GET("prices?key=0944af813ad7251af5c017dd8e1d0729")
    fun getData(): Observable<List<CryptoModel>>
}