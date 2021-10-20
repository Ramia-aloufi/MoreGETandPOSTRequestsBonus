package com.example.moregetandpostrequestsbonus


import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers

import retrofit2.http.POST

interface APIInterface {
    @Headers("Content-Type: application/json")
    @GET("/custom-people/")
    fun getNames(): Call<ArrayList<Names.NamesItem>>
    @Headers("Content-Type: application/json")
   @POST("/custom-people/")
   fun added(@Body userdat: Names.NamesItem):Call<Names.NamesItem>
}