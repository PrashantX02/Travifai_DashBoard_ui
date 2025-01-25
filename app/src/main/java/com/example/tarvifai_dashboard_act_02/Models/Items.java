package com.example.tarvifai_dashboard_act_02.Models;

public class Items {
    private int imageResId;
    private String name;

    public Items(int imageResId, String name) {
        this.imageResId = imageResId;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }
}