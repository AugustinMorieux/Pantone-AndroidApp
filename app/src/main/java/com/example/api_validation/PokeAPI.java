package com.example.api_validation;

import com.example.api_validation.model.PokeResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeAPI {
    //String ENDPOINT = "https://github.com/AugustinMorieux/data/blob/master/";


    @GET("Pantone.Json")
    Call<PokeResponse> getPokemon();

}
