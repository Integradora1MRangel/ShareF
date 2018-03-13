package com.example.marthaalvarado.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void nextActivity1(View view){
        startActivity(new Intent(this, Location.class));
    }

    public void nextActivity2(View view){
        startActivity(new Intent(this, MainActivity.class));
    }


    public void nextActivity3(View view){
        startActivity(new Intent(this, History.class));
    }
}
