package com.deadshot.scorecard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.deadshot.scorecard.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_layout);

        configureOnClickListeners();

    }

    private void configureOnClickListeners(){
        configureLetsPlayListners();
        configureAllMatchesListners();
    }

    private void configureAllMatchesListners() {

        LinearLayout llAllMatches = findViewById(R.id.dashboard_all_matches);

        llAllMatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, AllMatchesListActivity.class);
                startActivity(intent);
            }
        });
    }

    private void configureLetsPlayListners(){

        LinearLayout llLetsPlay = findViewById(R.id.dashboard_lets_play);

        llLetsPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, RecordGameActivity.class);
                startActivity(intent);
            }
        });

    }

}