package com.ocean.myinterviewtest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiName {

    @GET("/transactions/d7a0848add4e711b11d8b45e8e244582c730d54d726f5f0b661cfb90b81a5fff")
    Call<ResponseModel> getResponseData(@Query("c") String apiKey);


}
