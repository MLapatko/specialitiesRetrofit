package com.example.user.specialitiesretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 22.09.2017.
 */

public class SpecListRequest {
    @SerializedName("api_key")
    String mKey;
    @SerializedName("city_id")
    String mCityId;

    public SpecListRequest(String mKey, String mCityId) {
        this.mKey = mKey;
        this.mCityId = mCityId;
    }

}
