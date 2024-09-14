package com.example.listener1game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    Intent si;
    Button btnRed,btnBlue,btnNext;
    int redCounter = 0,blueCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRed = (Button) findViewById(R.id.btnRed);
        btnBlue = (Button) findViewById(R.id.btnBlue);

        btnRed.setOnLongClickListener(this);
        
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueCounter ++;
            }
        });
    }

    public void nextClicked(View view) {
        si = new Intent(this,ActivitySolutionGame.class);
        si.putExtra("redPoints", redCounter);
        si.putExtra("bluePoints", blueCounter);

        redCounter = 0;
        blueCounter = 0;
        startActivity(si);
    }


    @Override
    public boolean onLongClick(View v) {
        redCounter += 2;
        return false;
    }

}