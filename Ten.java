package com.example.chouka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Ten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        Button but4 = (Button)findViewById(R.id.button);
        ImageView img[]= new ImageView[9];
        img[0] = (ImageView)findViewById(R.id.imageView2);
        img[1] = (ImageView)findViewById(R.id.imageView3);
        img[2] = (ImageView)findViewById(R.id.imageView4);
        img[3] = (ImageView)findViewById(R.id.imageView5);
        img[4] = (ImageView)findViewById(R.id.imageView6);
        img[5] = (ImageView)findViewById(R.id.imageView7);
        img[6] = (ImageView)findViewById(R.id.imageView8);
        img[7] = (ImageView)findViewById(R.id.imageView9);
        img[8] = (ImageView)findViewById(R.id.imageView10);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass4();
            }
        });


        Random random = new Random();
        int num[] = new int[9];
        for (int i = 0 ; i<=8 ; i++) {
            num[i] = random.nextInt(1050);
            if(num[i]<20)
                img[i].setImageResource(R.drawable.b1);
            else if(num[i]>=20&&num[i]<40)
                img[i].setImageResource(R.drawable.b2);
            else if(num[i]>=40&&num[i]<60)
                img[i].setImageResource(R.drawable.b3);
            else if(num[i]>=60&&num[i]<80)
                img[i].setImageResource(R.drawable.b4);
            else if(num[i]>=80&&num[i]<100)
                img[i].setImageResource(R.drawable.b5);
            else if(num[i]>=100&&num[i]<120)
                img[i].setImageResource(R.drawable.b6);
            else if(num[i]>=120&&num[i]<140)
                img[i].setImageResource(R.drawable.b7);
            else if(num[i]>=140&&num[i]<160)
                img[i].setImageResource(R.drawable.b8);
            else if(num[i]>=160&&num[i]<180)
                img[i].setImageResource(R.drawable.b9);
            else if(num[i]>=180&&num[i]<200)
                img[i].setImageResource(R.drawable.b10);
            else if(num[i]>=200&&num[i]<220)
                img[i].setImageResource(R.drawable.b11);
            else if(num[i]>=220&&num[i]<240)
                img[i].setImageResource(R.drawable.b12);
            else if(num[i]>=240&&num[i]<260)
                img[i].setImageResource(R.drawable.b13);
            else if(num[i]>=260&&num[i]<280)
                img[i].setImageResource(R.drawable.b14);
            else if(num[i]>=280&&num[i]<300)
                img[i].setImageResource(R.drawable.b15);
            else if(num[i]>=300&&num[i]<320)
                img[i].setImageResource(R.drawable.b16);
            else if(num[i]>=320&&num[i]<340)
                img[i].setImageResource(R.drawable.b17);
            else if(num[i]>=340&&num[i]<360)
                img[i].setImageResource(R.drawable.b18);
            else if(num[i]>=360&&num[i]<380)
                img[i].setImageResource(R.drawable.b19);
            else if(num[i]>=380&&num[i]<400)
                img[i].setImageResource(R.drawable.b20);
            else if(num[i]>=400&&num[i]<420)
                img[i].setImageResource(R.drawable.b21);
            else if(num[i]>=420&&num[i]<460)
                img[i].setImageResource(R.drawable.b22);
            else if(num[i]>=460&&num[i]<480)
                img[i].setImageResource(R.drawable.b23);
            else if(num[i]>=480&&num[i]<500)
                img[i].setImageResource(R.drawable.b24);
            else if(num[i]>=500&&num[i]<520)
                img[i].setImageResource(R.drawable.b25);
            else if(num[i]>=520&&num[i]<540)
                img[i].setImageResource(R.drawable.b26);
            else if(num[i]>=540&&num[i]<555)
                img[i].setImageResource(R.drawable.a1);
            else if(num[i]>=555&&num[i]<570)
                img[i].setImageResource(R.drawable.a2);
            else if(num[i]>=570&&num[i]<585)
                img[i].setImageResource(R.drawable.a3);
            else if(num[i]>=585&&num[i]<600)
                img[i].setImageResource(R.drawable.a4);
            else if(num[i]>=600&&num[i]<615)
                img[i].setImageResource(R.drawable.a5);
            else if(num[i]>=615&&num[i]<630)
                img[i].setImageResource(R.drawable.a6);
            else if(num[i]>=630&&num[i]<645)
                img[i].setImageResource(R.drawable.a7);
            else if(num[i]>=645&&num[i]<660)
                img[i].setImageResource(R.drawable.a8);
            else if(num[i]>=660&&num[i]<675)
                img[i].setImageResource(R.drawable.a9);
            else if(num[i]>=675&&num[i]<690)
                img[i].setImageResource(R.drawable.a10);
            else if(num[i]>=690&&num[i]<705)
                img[i].setImageResource(R.drawable.a11);
            else if(num[i]>=705&&num[i]<720)
                img[i].setImageResource(R.drawable.a12);
            else if(num[i]>=720&&num[i]<735)
                img[i].setImageResource(R.drawable.a13);
            else if(num[i]>=735&&num[i]<750)
                img[i].setImageResource(R.drawable.a14);
            else if(num[i]>=750&&num[i]<765)
                img[i].setImageResource(R.drawable.a15);
            else if(num[i]>=765&&num[i]<780)
                img[i].setImageResource(R.drawable.a16);
            else if(num[i]>=780&&num[i]<795)
                img[i].setImageResource(R.drawable.a17);
            else if(num[i]>=795&&num[i]<810)
                img[i].setImageResource(R.drawable.a18);
            else if(num[i]>=810&&num[i]<825)
                img[i].setImageResource(R.drawable.a19);
            else if(num[i]>=825&&num[i]<845)
                img[i].setImageResource(R.drawable.s1);
            else if(num[i]>=845&&num[i]<865)
                img[i].setImageResource(R.drawable.s2);
            else if(num[i]>=865&&num[i]<885)
                img[i].setImageResource(R.drawable.s3);
            else if(num[i]>=885&&num[i]<905)
                img[i].setImageResource(R.drawable.s4);
            else if(num[i]>=905&&num[i]<925)
                img[i].setImageResource(R.drawable.s5);
            else if(num[i]>=925&&num[i]<945)
                img[i].setImageResource(R.drawable.s6);
            else if(num[i]>=945&&num[i]<965)
                img[i].setImageResource(R.drawable.s7);
            else if(num[i]>=965&&num[i]<985)
                img[i].setImageResource(R.drawable.s8);
            else if(num[i]>=985&&num[i]<995)
                img[i].setImageResource(R.drawable.ssr1);
            else if(num[i]>=995&&num[i]<1005)
                img[i].setImageResource(R.drawable.ssr2);
            else if(num[i]>=1005&&num[i]<1015)
                img[i].setImageResource(R.drawable.ssr3);
        }

        
    }
    public void pass4() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}