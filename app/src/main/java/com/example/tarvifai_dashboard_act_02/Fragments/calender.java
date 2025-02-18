package com.example.tarvifai_dashboard_act_02.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.airbnb.lottie.LottieAnimationView;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.builders.DatePickerBuilder;
import com.applandeo.materialcalendarview.listeners.OnSelectDateListener;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.tarvifai_dashboard_act_02.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class calender extends Fragment {

    private CalendarView calendarView;
    private LottieAnimationView calen_anim;
    private CardView datePicker;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_calender, container, false);
        ViewCompat.setOnApplyWindowInsetsListener(rootView.findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        datePicker = rootView.findViewById(R.id.card_calender);
        calen_anim = rootView.findViewById(R.id.calender_animation);

        calen_anim.setAnimation("calender_girl.json");
        calen_anim.playAnimation();

        datePicker.setOnClickListener((v)->{
            openDatePicker();
        });

        return rootView;
    }

    private void openDatePicker() {
        DatePickerBuilder builder = new DatePickerBuilder(getContext(), new OnSelectDateListener() {
            @Override
            public void onSelect(@NonNull List<Calendar> selectedDates) {
                if (!selectedDates.isEmpty()) {
                    Calendar selectedDate = selectedDates.get(0);
                    int day = selectedDate.get(Calendar.DAY_OF_MONTH);
                    int month = selectedDate.get(Calendar.MONTH) + 1;
                    int year = selectedDate.get(Calendar.YEAR);

                    //Toast.makeText(getContext(), "Selected Date: " + day + "/" + month + "/" + year, Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.pickerType(0);

        builder.headerColor(R.color.palm_purple_dark)
                .todayLabelColor(R.color.secondary)
                .abbreviationsBarColor(R.color.white)
                .selectionBackground(R.color.white)
                .selectionColor(R.color.secondary_light)
                .dialogButtonsColor(R.color.secondary)
                .build()
                .show();

        builder.build().show();
    }


    @Override
    public void onDestroy() {
        calen_anim.clearAnimation();
        super.onDestroy();
    }

    @Override
    public void onPause() {
        calen_anim.pauseAnimation();
        super.onPause();
    }

    @Override
    public void onResume() {
        calen_anim.resumeAnimation();
        super.onResume();
    }
}