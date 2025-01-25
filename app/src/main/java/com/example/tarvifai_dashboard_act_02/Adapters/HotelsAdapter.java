package com.example.tarvifai_dashboard_act_02.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.tarvifai_dashboard_act_02.Activity.payment_descriptiion;
import com.example.tarvifai_dashboard_act_02.Activity.view_hotel;
import com.example.tarvifai_dashboard_act_02.Models.Hotels_model;
import com.example.tarvifai_dashboard_act_02.R;

import java.util.List;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.HotelViewHolder> {

    private List<Hotels_model> hotelList;
    private Context context;
    public HotelsAdapter(Context context,List<Hotels_model> hotelList) {
        this.context = context;
        this.hotelList = hotelList;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_card, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotels_model hotel = hotelList.get(position);
        holder.hotelImage.setImageResource(hotel.getHotel());
        holder.cardView.setOnClickListener((v)->{
            Intent intent = new Intent(context, view_hotel.class);
            context.startActivity(intent);
            Animatoo.INSTANCE.animateSlideLeft(context);
        });
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

    public static class HotelViewHolder extends RecyclerView.ViewHolder {
        private ImageView hotelImage;
        private CardView cardView;
        public HotelViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.hotel_card);
            hotelImage = itemView.findViewById(R.id.imageView2);
        }
    }
}
