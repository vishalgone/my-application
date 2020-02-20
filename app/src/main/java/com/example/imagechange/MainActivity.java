package com.example.imagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


      Button b;
      boolean iscar=true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void changeImage(View v)
    {
        ImageView iv=findViewById(R.id.imageView2);
        if(iscar)
        {
            iv.setImageResource(R.drawable.bear);
            iscar=false;
        }
        else
        {
            iv.setImageResource(R.drawable.car);
            iscar=true;
        }

    }

}
