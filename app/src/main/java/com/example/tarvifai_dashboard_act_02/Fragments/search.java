package com.example.tarvifai_dashboard_act_02.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.tarvifai_dashboard_act_02.R;


public class search extends Fragment {
    private LottieAnimationView search_anim;
    private SearchView searchView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_search, container, false);

        search_anim = view.findViewById(R.id.search_anim);
        searchView  = view.findViewById(R.id.searchView);

        EditText editText =searchView.findViewById(androidx.appcompat.R.id.search_src_text);
        Context context = getContext();

        editText.setTextColor(ContextCompat.getColor(context,R.color.black_light));
        editText.setHintTextColor(ContextCompat.getColor(context,R.color.black_light));

        ImageView searchIcon = searchView.findViewById(androidx.appcompat.R.id.search_mag_icon);

        ImageView closeIcon = searchView.findViewById(androidx.appcompat.R.id.search_close_btn);
        closeIcon.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);

        search_anim.setRepeatCount(0);
        search_anim.setAnimation("search_scope_anim.json");
        search_anim.playAnimation();

        return view;
    }
}