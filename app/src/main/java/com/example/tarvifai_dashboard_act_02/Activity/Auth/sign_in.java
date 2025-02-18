package com.example.tarvifai_dashboard_act_02.Activity.Auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.tarvifai_dashboard_act_02.Activity.DashBoard;
import com.example.tarvifai_dashboard_act_02.Activity.preferences;
import com.example.tarvifai_dashboard_act_02.R;

public class sign_in extends AppCompatActivity {

    private Button signin;
    private LottieAnimationView view;

    private TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //id's
        signup = findViewById(R.id.textView21);
        signin = findViewById(R.id.logedIn);
        view = findViewById(R.id.sitting_auth_anim);

        view.setAnimation("animation_sitting_auth.json");
        view.playAnimation();

        signup.setOnClickListener((v)->{
            Intent intent  = new Intent(this,sign_up.class);
            startActivity(intent);
            Animatoo.INSTANCE.animateSlideLeft(sign_in.this);
        });
        signin.setOnClickListener((v)->{
            Intent intent = new Intent(this, preferences.class);
            startActivity(intent);
            Animatoo.INSTANCE.animateSlideLeft(sign_in.this);
        });
    }
}