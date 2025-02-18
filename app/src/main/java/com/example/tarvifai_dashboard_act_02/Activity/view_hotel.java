package com.example.tarvifai_dashboard_act_02.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.tarvifai_dashboard_act_02.Adapters.ViewPagerAdapter;
import com.example.tarvifai_dashboard_act_02.Adapters.View_hotel_Adapter_viewpager;
import com.example.tarvifai_dashboard_act_02.R;
import com.google.android.material.tabs.TabLayout;

public class view_hotel extends AppCompatActivity {

    private TabLayout tabLayout;
    private View_hotel_Adapter_viewpager viewPagerAdapter;
    private ViewPager viewPager;
    private TextView select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_hotel);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tabLayout = findViewById(R.id.tabLayout2);
        viewPager = findViewById(R.id.viewPager2);
        select = findViewById(R.id.button2);

        select.setOnClickListener((v)->{
            Intent intent = new Intent(view_hotel.this, payment_descriptiion.class);
            startActivity(intent);
            Animatoo.INSTANCE.animateSlideLeft(this);
        });

        viewPagerAdapter = new View_hotel_Adapter_viewpager(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.INSTANCE.animateSlideRight(this);
    }
}