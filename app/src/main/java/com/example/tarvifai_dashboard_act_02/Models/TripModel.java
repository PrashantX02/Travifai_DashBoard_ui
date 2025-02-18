package com.example.tarvifai_dashboard_act_02.Models;

public class TripModel {
    private String year;
    private int image;
    private String title;
    private String destination;
    private String dateRange;

    public TripModel(String year, int image, String title, String destination, String dateRange) {
        this.year = year;
        this.image = image;
        this.title = title;
        this.destination = destination;
        this.dateRange = dateRange;
    }

    public String getYear() {
        return year;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateRange() {
        return dateRange;
    }
}
