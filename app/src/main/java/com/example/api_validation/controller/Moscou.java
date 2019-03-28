package com.example.api_validation.controller;

import android.util.Log;

import com.example.api_validation.PokeAPI;
import com.example.api_validation.model.PokeResponse;
import com.example.api_validation.model.Pokemon;
import com.example.api_validation.view.MainActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Moscou {
    private PokeAPI pokeAPI;

    private MainActivity Vladivostok;
    public  Moscou(MainActivity vladivostok){this.Vladivostok = vladivostok;}

    public void onCreate()
    {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://augustinmorieux.github.io/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        pokeAPI = retrofit.create(PokeAPI.class);
    }

    public void Russia(){
        pokeAPI.getPokemon().enqueue(new Callback<PokeResponse>() {
            @Override
            public void onResponse(Call<PokeResponse> call, Response<PokeResponse> response) {
                List<Pokemon> listPokemon = response.body().getResults();
                Vladivostok.storeData(listPokemon);
                Vladivostok.showList(listPokemon);
            }

            @Override
            public void onFailure(Call<PokeResponse> call, Throwable t) {
                Log.d("ERROR", "Api error");
            }
        });
    }
}

