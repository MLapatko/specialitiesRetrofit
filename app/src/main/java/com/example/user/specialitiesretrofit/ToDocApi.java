package com.example.user.specialitiesretrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by user on 21.09.2017.
 */

public interface ToDocApi {
    @POST("v1/api/portal/specialization/get/list")
    Call<Speciality> getData(@Body SpecListRequest specListRequest);
}
