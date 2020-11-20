package com.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ApiInterface apiInterface;

    Button get,getId,getQuery,post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        get = findViewById(R.id.get);
        getId = findViewById(R.id.getId);
        getQuery = findViewById(R.id.getQuery);
        post = findViewById(R.id.post);

        apiInterface=ApiClient.getInstance().create(ApiInterface.class);

        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<List<Todo>> call = apiInterface.getTodos();
                call.enqueue(new Callback<List<Todo>>() {
                    @Override
                    public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {

                        Log.e(TAG,"onResponse: "+response.body());
                    }

                    @Override
                    public void onFailure(Call<List<Todo>> call, Throwable t) {
                        Log.e(TAG, "onFailure: " +t.getLocalizedMessage() );
                    }
                });

            }
        });

        getId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        getQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}