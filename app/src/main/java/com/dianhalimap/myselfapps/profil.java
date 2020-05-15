package com.dianhalimap.myselfapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void next(View view) {
        Intent intent = new Intent(profil.this, MapsActivity.class);
        startActivity(intent);
    }
}
