package com.example.minioyun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView sonucTextView;
    private int dogruSonuc = 0;

    private int yanlisSonuc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonucTextView =findViewById(R.id.sonucTextView);

    }
    public void onHandButtonClick(View view){
        boolean paraSolElde = new Random().nextBoolean();
        boolean solElSecildi = view.getId() == R.id.solel;

        if ((paraSolElde && solElSecildi)||(!paraSolElde && !solElSecildi)){
            dogruSonuc++;
            sonucTextView.setText("Tebrikler Doğru Seçim! Toplam Doğru: "+dogruSonuc);
            sonucTextView.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }else {
            yanlisSonuc++;
            sonucTextView.setText("Yanlış Seçim! Toplam Yanlış: "+yanlisSonuc);
            sonucTextView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        }
    }
}