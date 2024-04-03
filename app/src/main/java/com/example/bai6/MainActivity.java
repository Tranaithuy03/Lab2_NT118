package com.example.bai6;

import android.os.Bundle;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> mHeros ;

    HeroAdapter mHeroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerHero = findViewById(R.id.recyclerHero);
        mHeros = new ArrayList<>();
        createHeroList();
        mHeroAdapter= new HeroAdapter(this, mHeros);
       mRecyclerHero.setLayoutManager(new LinearLayoutManager(this));
       mRecyclerHero.setAdapter(mHeroAdapter);
    }
    private void createHeroList() {
        mHeros.add(new Hero("Thor",R.drawable.image_thor));
        mHeros.add(new Hero("IronMan",R.drawable.image_ironman));
        mHeros.add(new Hero("Hulk",R.drawable.image_hulk));
        mHeros.add(new Hero("SpiderMan",R.drawable.image_spiderman));
        mHeros.add(new Hero("Thor",R.drawable.image_thor));
        mHeros.add(new Hero("IronMan",R.drawable.image_ironman));
        mHeros.add(new Hero("Hulk",R.drawable.image_hulk));
        mHeros.add(new Hero("SpiderMan",R.drawable.image_spiderman));
        mHeros.add(new Hero("Thor",R.drawable.image_thor));
        mHeros.add(new Hero("IronMan",R.drawable.image_ironman));
    }
}