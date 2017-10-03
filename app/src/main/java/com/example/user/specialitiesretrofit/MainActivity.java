package com.example.user.specialitiesretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    //private List<Speciality> specialities;
    private String apiKey="grdo4hiTVXpu30PZkYXdO90jdZlLWnr6";
    private String idCity="1";
    private SpecListRequest specListRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        specListRequest=new SpecListRequest(apiKey,idCity);

        App.getApi().getData(specListRequest).enqueue(new Callback<Speciality>() {
            @Override
            public void onResponse(Call<Speciality> call, Response<Speciality> response) {
                Log.e("mylog", String.valueOf(response.headers()));
                Log.e("mylog", String.valueOf(response.code()));
                Log.e("mylog", String.valueOf(response.message()));
                Log.e("mylog", String.valueOf(response.raw()));
                Log.e("mylog", String.valueOf(response.body().toString()));
                Log.e("mylog", String.valueOf(response.isSuccessful()));

            }

            @Override
            public void onFailure(Call<Speciality> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                Log.e("mylog",t.toString());
                Log.e("mylog",call.toString());
            }
        });
    }
}
