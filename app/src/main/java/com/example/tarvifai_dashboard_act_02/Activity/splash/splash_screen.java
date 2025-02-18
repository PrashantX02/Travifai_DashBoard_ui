package com.example.tarvifai_dashboard_act_02.Activity.splash;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.tarvifai_dashboard_act_02.Activity.Auth.sign_in;
import com.example.tarvifai_dashboard_act_02.Activity.preferences;
import com.example.tarvifai_dashboard_act_02.R;

public class splash_screen extends AppCompatActivity {

    private LottieAnimationView splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        splash = findViewById(R.id.splash_animation);

        splash.setAnimation("splash_travifai.json");
        splash.setRepeatCount(0);
        splash.playAnimation();
        splash.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationEnd(@NonNull Animator animation) {
                Intent intent = new Intent(splash_screen.this, sign_in.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(splash_screen.this);
                finish();
            }

            @Override
            public void onAnimationCancel(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animation) {

            }
        });


        // namaste animation
        TextView namasteTextView = findViewById(R.id.namaste);
//        Animation flipAnimation = AnimationUtils.loadAnimation(this, R.anim.flip_left_to_right);
//
//        flipAnimation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                namasteTextView.setText("Hello!");
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//
//        namasteTextView.startAnimation(flipAnimation);

    }

    @Override
    protected void onDestroy() {
        splash.clearAnimation();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        splash.pauseAnimation();
        super.onPause();
    }

    @Override
    protected void onResume() {
        splash.playAnimation();
        super.onResume();
    }
}