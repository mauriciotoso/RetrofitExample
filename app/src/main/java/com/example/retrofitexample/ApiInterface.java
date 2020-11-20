package com.example.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiInterface {

    @GET("todos")
    Call<List<Todo>> getTodos();

    @GET("todos/{id}")
    Call<Todo> getTodos(@Path("id") int id);

    @GET("todos/{id}")
    Call<Todo> getTodoUsingQuery(@Query("id") int id);

    @POST("todos")
    Call<Todo> postTodo(@Body Todo todo);

}
