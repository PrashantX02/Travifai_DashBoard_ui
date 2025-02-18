package com.example.tarvifai_dashboard_act_02.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.tarvifai_dashboard_act_02.Fragments.MainFragment;
import com.example.tarvifai_dashboard_act_02.Fragments.Profile;
import com.example.tarvifai_dashboard_act_02.Fragments.calender;
import com.example.tarvifai_dashboard_act_02.Fragments.mytrip;
import com.example.tarvifai_dashboard_act_02.Fragments.search;
import com.example.tarvifai_dashboard_act_02.R;

public class DashBoard extends AppCompatActivity {

    private ImageView account, calender, trip, search;
    private TextView home, account_text, trip_text, calender_text, search_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        EdgeToEdge.enable(this);

        // Initialize UI elements
        search =findViewById(R.id.imageView4);
        search_text  = findViewById(R.id.textView9);
        account = findViewById(R.id.account);
        calender = findViewById(R.id.imageView10);
        home = findViewById(R.id.home);
        trip = findViewById(R.id.imageView11);
        account_text = findViewById(R.id.textView17);
        trip_text = findViewById(R.id.textView8);
        calender_text = findViewById(R.id.textView6);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set click listeners
        search.setOnClickListener(v->{loadFragment(new search());});
        search_text.setOnClickListener(v->{ loadFragment(new search());});
        account.setOnClickListener(v -> loadFragment(new Profile()));
        account_text.setOnClickListener(v -> loadFragment(new Profile()));
        calender.setOnClickListener(v -> loadFragment(new calender()));
        calender_text.setOnClickListener(v -> loadFragment(new calender()));
        trip.setOnClickListener(v -> loadFragment(new mytrip()));
        trip_text.setOnClickListener(v -> loadFragment(new mytrip()));
        home.setOnClickListener(v -> loadFragment(new MainFragment()));

        // Load default fragment
        loadFragment(new MainFragment());
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment prev_fragment = fragmentManager.findFragmentById(R.id.container);

        if (prev_fragment != null && prev_fragment.getClass().equals(fragment.getClass())) return;

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.getBackStackEntryCount() == 1) {
            finish();
        } else {
            super.onBackPressed();
            Animatoo.INSTANCE.animateSlideRight(this);
        }
        Animatoo.INSTANCE.animateSlideRight(this);
    }
}
