package com.dianhalimap.myselfapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends AppCompatActivity {
    private int waktu_loading=3000;

    //3000=3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                //setelah loading maka akan langsung berpindah ke
                Intent home=new Intent(Splashscreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
            }
}
