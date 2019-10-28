package com.android.cardview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{


    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.mTitleTv.setText(models.get(position).getTitle());
        holder.mDescrTv.setText(models.get(position).getDescription());
        holder.mImageIv.setImageResource(models.get(position).getImg());

        Animation animation = AnimationUtils.loadAnimation(c,android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                if(models.get(pos).getTitle().equals("Cactus-Succluent")){
                    Intent intent = new Intent(c, CactusActivity.class);
                    c.startActivity(intent);
                }
                if(models.get(pos).getTitle().equals("Fruit Plants")){
                    Intent intent = new Intent(c, FruitActivity.class);
                    c.startActivity(intent);
                }
                if(models.get(pos).getTitle().equals("Flower Plants")){
                    Intent intent = new Intent(c, FlowerActivity.class);
                    c.startActivity(intent);
                }
                if(models.get(pos).getTitle().equals("Ornamental Grass")){
                    Intent intent = new Intent(c, GrassActivity.class);
                    c.startActivity(intent);
                }
                if(models.get(pos).getTitle().equals("ClimbersActivity")){
                    Intent intent = new Intent(c, ClimbersActivity.class);
                    c.startActivity(intent);
                }


            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
