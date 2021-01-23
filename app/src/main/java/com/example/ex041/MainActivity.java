package com.example.ex041;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iV;
    Random rnd;
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        iV = (ImageView) findViewById(R.id.iV);

        rnd  = new Random();
    }

    public void makeRandom(View view) {
        randomNumber = rnd.nextInt(3) + 1;
        btn.setText("" + randomNumber);

        switch (randomNumber)
        {
            case 1:
                iV.setImageResource(R.drawable.one);
                break;
            case 2:
                iV.setImageResource(R.drawable.two);
                break;
            case 3:
                iV.setImageResource(R.drawable.three);
                break;
        }
    }
}