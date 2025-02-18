package com.example.tarvifai_dashboard_act_02.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.tarvifai_dashboard_act_02.Adapters.NamesAdapterHorizontal;
import com.example.tarvifai_dashboard_act_02.Adapters.ViewPagerAdapter;
import com.example.tarvifai_dashboard_act_02.Adapters.horizontalAdapterImage;
import com.example.tarvifai_dashboard_act_02.Models.Items;
import com.example.tarvifai_dashboard_act_02.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {

    private RecyclerView horizontalRecyclerView;
    private horizontalAdapterImage horizontalAdapterImage;
    private NamesAdapterHorizontal namesAdapterHorizontal;
    private List<Items> itemList;
    private List<String> names;
    private RecyclerView namesRecyclerView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        ViewCompat.setOnApplyWindowInsetsListener(rootView.findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        horizontalRecyclerView = rootView.findViewById(R.id.horizontal_recyclerView);
        namesRecyclerView = rootView.findViewById(R.id.horizontal_recyclerView_2);
        viewPager = rootView.findViewById(R.id.viewPager);
        tabLayout = rootView.findViewById(R.id.tabLayout);

        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        namesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        names = new ArrayList<>();
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");
        names.add("Adventure");

        itemList = new ArrayList<>();
        itemList.add(new Items(R.drawable.slide4, "Alice"));
        itemList.add(new Items(R.drawable.slide3, "Alice"));
        itemList.add(new Items(R.drawable.slide2, "Alice"));
        itemList.add(new Items(R.drawable.slide1, "Alice"));
        itemList.add(new Items(R.drawable.slide4, "Alice"));
        itemList.add(new Items(R.drawable.slide3, "Alice"));
        itemList.add(new Items(R.drawable.slide2, "Alice"));
        itemList.add(new Items(R.drawable.slide1, "Alice"));
        itemList.add(new Items(R.drawable.slide4, "Alice"));
        itemList.add(new Items(R.drawable.slide3, "Alice"));
        itemList.add(new Items(R.drawable.slide2, "Alice"));
        itemList.add(new Items(R.drawable.slide1, "Alice"));
        itemList.add(new Items(R.drawable.slide4, "Alice"));
        itemList.add(new Items(R.drawable.slide3, "Alice"));
        itemList.add(new Items(R.drawable.slide2, "Alice"));
        itemList.add(new Items(R.drawable.slide1, "Alice"));
        itemList.add(new Items(R.drawable.slide4, "Alice"));

        horizontalAdapterImage = new horizontalAdapterImage(getContext(),itemList);
        horizontalRecyclerView.setAdapter(horizontalAdapterImage);

        namesAdapterHorizontal = new NamesAdapterHorizontal(names);
        namesRecyclerView.setAdapter(namesAdapterHorizontal);

        return rootView;
    }
}
