package com.example.tarvifai_dashboard_act_02.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tarvifai_dashboard_act_02.Fragments.Hotels;

public  class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(androidx.fragment.app.FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Hotels();
            case 1:
                return new Hotels();
            default:
                return new Hotels();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Hotels";
            case 1:
                return "Vilas";
            case 2:
                return "Resorts";
            case 3:
                return "Beach Resorts";
            case 4:
                return "Staycation";
            default:
                return null;
        }
    }
}
