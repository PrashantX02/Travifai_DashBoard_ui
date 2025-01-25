package com.example.tarvifai_dashboard_act_02.Models;

import android.widget.ImageView;

public class Hotels_model {
    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    private int hotel;
    public Hotels_model(int image){
        this.hotel = image;
    }
}
