package com.sirikyebrian.alc4phase1challenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutPage(View view) {
        Intent intent = new Intent(this,AboutALCActivity.class);
        startActivity(intent);
    }

    public void openMyProfile(View view) {
        Intent intent = new Intent(this,MyProfileActivity.class);
        startActivity(intent);
    }
}
