package com.example.audioapi;

import retrofit2.http.POST;

public interface ApiInterface {
    @POST("/api/users")

    Call<User>
}
