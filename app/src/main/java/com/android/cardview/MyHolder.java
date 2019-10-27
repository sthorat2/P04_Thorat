package com.android.cardview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView mImageIv;
    TextView mTitleTv,mDescrTv;
    ItemClickListener itemClickListener;


    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mImageIv = itemView.findViewById(R.id.modelImageIv);
        this.mTitleTv = itemView.findViewById(R.id.modelTitleTv);
        this.mDescrTv = itemView.findViewById(R.id.modelDetailTv);
        itemView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());


    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener =ic;
    }
}
