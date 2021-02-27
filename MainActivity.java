package com.example.chouka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1 = (Button) findViewById(R.id.button1);
        Button but2 = (Button) findViewById(R.id.button2);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passOne();
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passTen();
            }
        });
    }
    public void passOne() {
        Intent intent1 = new Intent(this, One.class);
        Random random = new Random();
        int num10;
        num10 = random.nextInt(1015);
        intent1.putExtra("num10", num10);
        startActivity(intent1);
    }
    public void passTen() {
        Intent intent = new Intent(this, Ten.class);
        startActivity(intent);
    }
}