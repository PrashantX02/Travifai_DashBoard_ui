package com.example.tarvifai_dashboard_act_02.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tarvifai_dashboard_act_02.Fragments.About;
import com.example.tarvifai_dashboard_act_02.Fragments.Amenities;
import com.example.tarvifai_dashboard_act_02.Fragments.Itinearray;
import com.example.tarvifai_dashboard_act_02.Fragments.Maps_and_Nearby;
import com.example.tarvifai_dashboard_act_02.Fragments.Room_type;

public class View_hotel_Adapter_viewpager extends FragmentPagerAdapter {

    private final String[] tabTitles = {"About", "Amenities", "Room Type", "Maps & Nearby", "Itinerary"};

    public View_hotel_Adapter_viewpager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new About();
            case 1:
                return new Amenities();
            case 2:
                return new Room_type();
            case 3:
                return new Maps_and_Nearby();
            default:
                return new Itinearray();
        }
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
