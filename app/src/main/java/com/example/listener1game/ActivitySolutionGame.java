package com.example.listener1game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitySolutionGame extends AppCompatActivity {

    TextView tV1, tV2, tVWinner;
    Intent gi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_game);

        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        tVWinner = findViewById(R.id.tVWinner);

        gi = getIntent();
        int redPoints = gi.getIntExtra("redPoints", -1);
        int bluePoints = gi.getIntExtra("bluePoints", -1);

        tV1.setText("red score: " + redPoints);
        tV2.setText("blue score: " + bluePoints);

        if(bluePoints>redPoints)
            tVWinner.setText("The winner is Blue");
        else if(bluePoints<redPoints)
            tVWinner.setText("The winner is Red");
        else
            tVWinner.setText("It's a draw");
    }

    public void goback(View view) {
        finish();
    }
}