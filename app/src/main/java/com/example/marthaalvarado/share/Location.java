package com.example.marthaalvarado.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }
    public void nextActivity2(View view){
        startActivity(new Intent(this, MainActivityTwo.class));
    }



    public void next(View view){
Intent intent;
            intent= new Intent(this, Main2Activity.class);
            String value="http:www.iberotec.edu.pe";
        getIntent().putExtra("value",value);
        startActivity(intent);
    }

}
