package com.ijikod.sensyne.Service

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url

interface Api{

    @Streaming
    @GET
    fun downloadFile(@Url fileUrl : String): Call<ResponseBody>

}