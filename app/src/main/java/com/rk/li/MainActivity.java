package com.rk.li;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout KontenView;
    private View Sub1Activity, Sub2Activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KontenView = findViewById(R.id.konten_view);

        Sub1Activity = getLayoutInflater().inflate(R.layout.activity_sub1_activity, KontenView, false);
        Sub2Activity = getLayoutInflater().inflate(R.layout.activity_sub2_activity, KontenView, false);

        KontenView.addView(Sub1Activity);
        KontenView.addView(Sub2Activity);
    }
}
