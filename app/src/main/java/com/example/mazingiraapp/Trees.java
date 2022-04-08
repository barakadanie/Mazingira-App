package com.example.mazingiraapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Trees extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trees);
        c1=findViewById(R.id.card1);
        c2=findViewById(R.id.card2);
        c3=findViewById(R.id.card3);
        c4=findViewById(R.id.card4);
        c5=findViewById(R.id.card5);

        c1.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),Hardwood.class);
            startActivity(intent);
        });
        c2.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),SoftWood.class);
            startActivity(intent);
        });
        c3.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),Indegenious.class);
            startActivity(intent);
        });
    }
}