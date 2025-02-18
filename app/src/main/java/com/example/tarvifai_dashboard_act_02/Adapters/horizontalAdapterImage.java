package com.example.tarvifai_dashboard_act_02.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.tarvifai_dashboard_act_02.Activity.review_activity;
import com.example.tarvifai_dashboard_act_02.Models.Items;
import com.example.tarvifai_dashboard_act_02.R;

import java.util.List;

public class horizontalAdapterImage extends RecyclerView.Adapter<horizontalAdapterImage.ImageViewHolder> {

    private List<Items> itemList;
    private Context context;
    public horizontalAdapterImage(Context context,List<Items> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.horizontal_recyclerview_items, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        Items item = itemList.get(position);
        holder.imageView.setImageResource(item.getImageResId());
        holder.nameTextView.setText(item.getName());

        holder.imageView.setOnClickListener((v)->{
            Intent intent  = new Intent(holder.itemView.getContext() , review_activity.class);
            holder.itemView.getContext() .startActivity(intent);
           Animatoo.INSTANCE.animateSlideLeft(holder.itemView.getContext() );
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;

        public ImageViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }


}