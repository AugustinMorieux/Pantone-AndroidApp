package com.example.api_validation.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.api_validation.MyAdapter;
import com.example.api_validation.PokeAPI;
import com.example.api_validation.R;
import com.example.api_validation.controller.Moscou;
import com.example.api_validation.model.PokeResponse;
import com.example.api_validation.model.Pokemon;
import com.example.api_validation.view.Main2Activity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends Activity {

    //PokeAPI pokeAPI;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Moscou controller;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        controller = new Moscou(this);
        controller.onCreate();
        controller.Russia();

    }

    //ACTIVITE
    public void startSecond(Pokemon item) {

        // Create an Intent to start the second activity
        Intent Intent2 = new Intent(this, Main2Activity.class);

        Gson gson = new Gson();
        String jsonItem = gson.toJson(item);

        Intent2.putExtra("key", jsonItem);
        // Start the new activity.
        startActivity(Intent2);
        Animatoo.animateSlideLeft(this);
    }





    public void showList(List<Pokemon> listPokemon) {
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // showList(listPokemon);
        mAdapter = new MyAdapter(listPokemon, getListener());
        recyclerView.setAdapter(mAdapter);
    }

    private MyAdapter.OnItemClickListener getListener() {
        return new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Pokemon item) {
                startSecond(item);
            }
        };
    }



    public void storeData(List<Pokemon> listPokemon) {
    }
}

