package com.litwin.lab02_nwd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView picture;
    EditText valueA;
    EditText valueB;
    TextView textResult;
    Button buttonNWD;
    Button buttonNWW;

    View.OnClickListener NWDListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a = 0;
            int b = 0;
            NWD nwd = new NWD();
            if(!valueA.getText().toString().isEmpty() && !valueB.getText().toString().isEmpty()){
                a = Integer.parseInt(valueA.getText().toString());
                b = Integer.parseInt(valueB.getText().toString());
            }
            int result = nwd.calculateNWD(a, b);
            String text = "Wynik: " + result;
            textResult.setText(text);
        }
    };

    View.OnClickListener NWWListner = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            int a = 0;
            int b = 0;
            int result = 0;
            String text = "";
            NWW nww = new NWW();
            if(!valueA.getText().toString().isEmpty() && !valueB.getText().toString().isEmpty()){
                a = Integer.parseInt(valueA.getText().toString());
                b = Integer.parseInt(valueB.getText().toString());
            }
            if(a>0 && b>0)
            {
                result = nww.calculateNWW(a, b);
                text = "Wynik: " + result;
            }
            else{
                text = "Nie można wyznaczyć NWW przy zerach!";
            }
            textResult.setText(text);
        }
    };


    View.OnClickListener changeImage = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            List<Integer> images = new ArrayList<>();
            images.add(R.drawable.facet1);
            images.add(R.drawable.facet2);
            images.add(R.drawable.facet3);
            images.add(R.drawable.facet4);
            images.add(R.drawable.facet5);
            images.add(R.drawable.facet7);
            images.add(R.drawable.facet7a);
            images.add(R.drawable.facet8);
            images.add(R.drawable.facet9);
            images.add(R.drawable.facet10);
            images.add(R.drawable.facet11);
            Random random = new Random();
            int rand = random.nextInt(images.size());
            picture.setImageResource(images.get(rand));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueA = findViewById(R.id.ValueA);
        valueB = findViewById(R.id.ValueB);
        textResult = findViewById(R.id.textResult);

        picture = findViewById(R.id.imageView);
        picture.setOnClickListener(changeImage);

        buttonNWD = findViewById(R.id.button_NWD);
        buttonNWD.setOnClickListener(NWDListener);

        buttonNWW = findViewById(R.id.button_NWW);
        buttonNWW.setOnClickListener(NWWListner);
    }
}