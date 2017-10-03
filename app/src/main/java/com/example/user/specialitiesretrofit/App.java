package com.example.user.specialitiesretrofit;

import android.app.Application;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 21.09.2017.
 */

public class App extends Application {
    private static ToDocApi toDocApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClientBuilder.addInterceptor(logging);
        OkHttpClient okHttpClient = httpClientBuilder.build();
        retrofit=new Retrofit.Builder().baseUrl("http://api.medcrm.dev.lovata.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        toDocApi=retrofit.create(ToDocApi.class);
    }
    public static ToDocApi getApi(){
        return toDocApi;
    }
}
