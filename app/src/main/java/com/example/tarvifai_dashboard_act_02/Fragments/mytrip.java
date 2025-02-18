package com.example.tarvifai_dashboard_act_02.Fragments;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.tarvifai_dashboard_act_02.Adapters.TripAdapter;
import com.example.tarvifai_dashboard_act_02.Models.TripModel;
import com.example.tarvifai_dashboard_act_02.R;

import java.util.ArrayList;
import java.util.List;

public class mytrip extends Fragment {

    private RecyclerView tripView;
    private TripAdapter trip_adapter;
    private List<TripModel> tripList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_mytrip, container, false);


        // Customizing searhView
        SearchView searchView = view.findViewById(R.id.searchView);

        EditText searchText = searchView.findViewById(androidx.appcompat.R.id.search_src_text);
        searchText.setTextColor(ContextCompat.getColor(getContext(),R.color.black_light));
        searchText.setHintTextColor(ContextCompat.getColor(getContext(),R.color.black_light));

        // Change Close Button  Icon Color
        ImageView closeIcon = searchView.findViewById(androidx.appcompat.R.id.search_close_btn);
        closeIcon.setColorFilter(ContextCompat.getColor(getContext(), R.color.black), PorterDuff.Mode.SRC_IN);


        tripView = view.findViewById(R.id.trip_RecyclerView);
        tripView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        tripList = new ArrayList<>();

        tripList.add(new TripModel("2 0 1 9", R.drawable.landon, "TRIP TO", "LONDON", "22-February   21-April"));
        tripList.add(new TripModel("2 0 2 2", R.drawable.arab, "TRIP TO", "DUBAI", "11-April   20-April"));
        tripList.add(new TripModel("2 0 1 8", R.drawable.taj, "TRIP TO", "INDIA", "22-January   20-April"));
        tripList.add(new TripModel("2 0 1 7", R.drawable.newyork_skyline, "TRIP TO", "NEW YORK", "29-January   17-March"));
        tripList.add(new TripModel("2 0 1 8", R.drawable.paris_skyline, "TRIP TO", "PARIS", "10-February   20-April"));

        trip_adapter = new TripAdapter(getContext(), tripList);
        tripView.setAdapter(trip_adapter);

        return view;
    }
}