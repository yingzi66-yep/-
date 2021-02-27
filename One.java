package com.example.chouka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class One extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Button but3 = (Button)findViewById(R.id.button);
        ImageView img10 = (ImageView)findViewById(R.id.imageView11);
        Intent intent1 =getIntent();
        int num10 = intent1.getIntExtra("num10",0);
        if(num10<20)
            img10.setImageResource(R.drawable.b1);
        else if(num10>=20&&num10<40)
            img10.setImageResource(R.drawable.b2);
        else if(num10>=40&&num10<60)
            img10.setImageResource(R.drawable.b3);
        else if(num10>=60&&num10<80)
            img10.setImageResource(R.drawable.b4);
        else if(num10>=80&&num10<100)
            img10.setImageResource(R.drawable.b5);
        else if(num10>=100&&num10<120)
            img10.setImageResource(R.drawable.b6);
        else if(num10>=120&&num10<140)
            img10.setImageResource(R.drawable.b7);
        else if(num10>=140&&num10<160)
            img10.setImageResource(R.drawable.b8);
        else if(num10>=160&&num10<180)
            img10.setImageResource(R.drawable.b9);
        else if(num10>=180&&num10<200)
            img10.setImageResource(R.drawable.b10);
        else if(num10>=200&&num10<220)
            img10.setImageResource(R.drawable.b11);
        else if(num10>=220&&num10<240)
            img10.setImageResource(R.drawable.b12);
        else if(num10>=240&&num10<260)
            img10.setImageResource(R.drawable.b13);
        else if(num10>=260&&num10<280)
            img10.setImageResource(R.drawable.b14);
        else if(num10>=280&&num10<300)
            img10.setImageResource(R.drawable.b15);
        else if(num10>=300&&num10<320)
            img10.setImageResource(R.drawable.b16);
        else if(num10>=320&&num10<340)
            img10.setImageResource(R.drawable.b17);
        else if(num10>=340&&num10<360)
            img10.setImageResource(R.drawable.b18);
        else if(num10>=360&&num10<380)
            img10.setImageResource(R.drawable.b19);
        else if(num10>=380&&num10<400)
            img10.setImageResource(R.drawable.b20);
        else if(num10>=400&&num10<420)
            img10.setImageResource(R.drawable.b21);
        else if(num10>=420&&num10<460)
            img10.setImageResource(R.drawable.b22);
        else if(num10>=460&&num10<480)
            img10.setImageResource(R.drawable.b23);
        else if(num10>=480&&num10<500)
            img10.setImageResource(R.drawable.b24);
        else if(num10>=500&&num10<520)
            img10.setImageResource(R.drawable.b25);
        else if(num10>=520&&num10<540)
            img10.setImageResource(R.drawable.b26);
        else if(num10>=540&&num10<555)
            img10.setImageResource(R.drawable.a1);
        else if(num10>=555&&num10<570)
            img10.setImageResource(R.drawable.a2);
        else if(num10>=570&&num10<585)
            img10.setImageResource(R.drawable.a3);
        else if(num10>=585&&num10<600)
            img10.setImageResource(R.drawable.a4);
        else if(num10>=600&&num10<615)
            img10.setImageResource(R.drawable.a5);
        else if(num10>=615&&num10<630)
            img10.setImageResource(R.drawable.a6);
        else if(num10>=630&&num10<645)
            img10.setImageResource(R.drawable.a7);
        else if(num10>=645&&num10<660)
            img10.setImageResource(R.drawable.a8);
        else if(num10>=660&&num10<675)
            img10.setImageResource(R.drawable.a9);
        else if(num10>=675&&num10<690)
            img10.setImageResource(R.drawable.a10);
        else if(num10>=690&&num10<705)
            img10.setImageResource(R.drawable.a11);
        else if(num10>=705&&num10<720)
            img10.setImageResource(R.drawable.a12);
        else if(num10>=720&&num10<735)
            img10.setImageResource(R.drawable.a13);
        else if(num10>=735&&num10<750)
            img10.setImageResource(R.drawable.a14);
        else if(num10>=750&&num10<765)
            img10.setImageResource(R.drawable.a15);
        else if(num10>=765&&num10<780)
            img10.setImageResource(R.drawable.a16);
        else if(num10>=780&&num10<795)
            img10.setImageResource(R.drawable.a17);
        else if(num10>=795&&num10<810)
            img10.setImageResource(R.drawable.a18);
        else if(num10>=810&&num10<825)
            img10.setImageResource(R.drawable.a19);
        else if(num10>=825&&num10<845)
            img10.setImageResource(R.drawable.s1);
        else if(num10>=845&&num10<865)
            img10.setImageResource(R.drawable.s2);
        else if(num10>=865&&num10<885)
            img10.setImageResource(R.drawable.s3);
        else if(num10>=885&&num10<905)
            img10.setImageResource(R.drawable.s4);
        else if(num10>=905&&num10<925)
            img10.setImageResource(R.drawable.s5);
        else if(num10>=925&&num10<945)
            img10.setImageResource(R.drawable.s6);
        else if(num10>=945&&num10<965)
            img10.setImageResource(R.drawable.s7);
        else if(num10>=965&&num10<985)
            img10.setImageResource(R.drawable.s8);
        else if(num10>=985&&num10<995)
            img10.setImageResource(R.drawable.ssr1);
        else if(num10>=995&&num10<1005)
            img10.setImageResource(R.drawable.ssr2);
        else if(num10>=1005&&num10<1015)
            img10.setImageResource(R.drawable.ssr3);



        //img10.setImageResource(R.drawable.a2);

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass3();
            }
        });
    }
    public void pass3() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}