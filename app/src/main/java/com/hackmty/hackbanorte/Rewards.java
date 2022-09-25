package com.hackmty.hackbanorte;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Rewards extends AppCompatActivity {
    ImageView img1,img3,img4,img5,img6,img7,img8,img9,img10;
    TextView img2;
    Button reclamar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);
        reclamar = findViewById(R.id.btnReclamar);
    }
    public void seleccionar1(View v){
            img1.setBackgroundColor(Color.GRAY);
            img2.setBackgroundColor(Color.WHITE);
            img3.setBackgroundColor(Color.WHITE);
            img4.setBackgroundColor(Color.WHITE);
            img5.setBackgroundColor(Color.WHITE);
            img6.setBackgroundColor(Color.WHITE);
            img7.setBackgroundColor(Color.WHITE);
            img8.setBackgroundColor(Color.WHITE);
            img9.setBackgroundColor(Color.WHITE);
            reclamar.setEnabled(true);
    }
    public void seleccionar2(View v){
        img2.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img3.setBackgroundColor(Color.WHITE);
        img4.setBackgroundColor(Color.WHITE);
        img5.setBackgroundColor(Color.WHITE);
        img6.setBackgroundColor(Color.WHITE);
        img7.setBackgroundColor(Color.WHITE);
        img8.setBackgroundColor(Color.WHITE);
        img9.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
    public void seleccionar3(View v){
        img3.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img2.setBackgroundColor(Color.WHITE);
        img4.setBackgroundColor(Color.WHITE);
        img5.setBackgroundColor(Color.WHITE);
        img6.setBackgroundColor(Color.WHITE);
        img7.setBackgroundColor(Color.WHITE);
        img8.setBackgroundColor(Color.WHITE);
        img9.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
    public void seleccionar4(View v){
        img4.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img2.setBackgroundColor(Color.WHITE);
        img3.setBackgroundColor(Color.WHITE);
        img5.setBackgroundColor(Color.WHITE);
        img6.setBackgroundColor(Color.WHITE);
        img7.setBackgroundColor(Color.WHITE);
        img8.setBackgroundColor(Color.WHITE);
        img9.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
    public void seleccionar5(View v){
        img5.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img2.setBackgroundColor(Color.WHITE);
        img3.setBackgroundColor(Color.WHITE);
        img4.setBackgroundColor(Color.WHITE);
        img6.setBackgroundColor(Color.WHITE);
        img7.setBackgroundColor(Color.WHITE);
        img8.setBackgroundColor(Color.WHITE);
        img9.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
    public void seleccionar6(View v){
        img6.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img2.setBackgroundColor(Color.WHITE);
        img3.setBackgroundColor(Color.WHITE);
        img4.setBackgroundColor(Color.WHITE);
        img5.setBackgroundColor(Color.WHITE);
        img7.setBackgroundColor(Color.WHITE);
        img8.setBackgroundColor(Color.WHITE);
        img9.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
    public void seleccionar7(View v){
        img7.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img2.setBackgroundColor(Color.WHITE);
        img3.setBackgroundColor(Color.WHITE);
        img4.setBackgroundColor(Color.WHITE);
        img5.setBackgroundColor(Color.WHITE);
        img6.setBackgroundColor(Color.WHITE);
        img8.setBackgroundColor(Color.WHITE);
        img9.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
    public void seleccionar8(View v){
        img8.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img2.setBackgroundColor(Color.WHITE);
        img3.setBackgroundColor(Color.WHITE);
        img4.setBackgroundColor(Color.WHITE);
        img5.setBackgroundColor(Color.WHITE);
        img6.setBackgroundColor(Color.WHITE);
        img7.setBackgroundColor(Color.WHITE);
        img9.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
    public void seleccionar9(View v){
        img9.setBackgroundColor(Color.GRAY);
        img1.setBackgroundColor(Color.WHITE);
        img2.setBackgroundColor(Color.WHITE);
        img3.setBackgroundColor(Color.WHITE);
        img4.setBackgroundColor(Color.WHITE);
        img5.setBackgroundColor(Color.WHITE);
        img6.setBackgroundColor(Color.WHITE);
        img7.setBackgroundColor(Color.WHITE);
        img8.setBackgroundColor(Color.WHITE);
        reclamar.setEnabled(true);
    }
}