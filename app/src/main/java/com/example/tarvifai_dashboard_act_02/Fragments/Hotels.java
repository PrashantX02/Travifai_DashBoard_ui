package com.example.tarvifai_dashboard_act_02.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tarvifai_dashboard_act_02.Activity.DashBoard;
import com.example.tarvifai_dashboard_act_02.Adapters.HotelsAdapter;
import com.example.tarvifai_dashboard_act_02.Models.Hotels_model;
import com.example.tarvifai_dashboard_act_02.R;

import java.util.ArrayList;
import java.util.List;


public class Hotels extends Fragment {

    private RecyclerView recyclerView;
    private HotelsAdapter hotelsAdapter;
    private List<Hotels_model> hotelList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_hotels, container, false);

        //id's
        recyclerView = view.findViewById(R.id.cards);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        // Initialize the hotel list
        hotelList = new ArrayList<>();
        hotelList.add(new Hotels_model(R.drawable.room));
        hotelList.add(new Hotels_model(R.drawable.room));
        hotelList.add(new Hotels_model(R.drawable.room));
        hotelList.add(new Hotels_model(R.drawable.room));

        // setting up adapter
        hotelsAdapter = new HotelsAdapter(getContext(),hotelList);
        recyclerView.setAdapter(hotelsAdapter);

        return view;
    }
}