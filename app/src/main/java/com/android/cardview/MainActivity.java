package com.android.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recycler View
        mRecyclerView = findViewById(R.id.recycler_view);
        //LinearLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //GridLayout - 2 cols in each row
        //mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        myAdapter = new MyAdapter(this,getPlayers());
        mRecyclerView.setAdapter(myAdapter);
    }



    private ArrayList<Model> getPlayers(){

        ArrayList<Model> models = new ArrayList<>();

        Model p = new Model();
        p.setTitle("Cactus-Succluent");
        p.setDescription("This section has Cactus and Succulents,Click to go to this section");
        p.setImg(R.drawable.cactus);
        models.add(p);

        p = new Model();
        p.setTitle("Fruit Plants");
        p.setDescription("This section has Fruit Plants,Click to go to this section");
        p.setImg(R.drawable.fruit);
        models.add(p);

        p = new Model();
        p.setTitle("Flower Plants");
        p.setDescription("This section has Flower Plants,Click to go to this section");
        p.setImg(R.drawable.flower);
        models.add(p);

        p = new Model();
        p.setTitle("Ornamental Grass");
        p.setDescription("This section has Ornamental grasses,Click to go to this section");
        p.setImg(R.drawable.grass);
        models.add(p);

        p = new Model();
        p.setTitle("ClimbersActivity");
        p.setDescription("This section has ClimbersActivity,Click to go to this section");
        p.setImg(R.drawable.climbers);
        models.add(p);

        return models;
    }
}
