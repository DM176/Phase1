package com.example.project_version1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void goToProfile(View view) {
        Intent i=new Intent(getApplicationContext(),Profile.class);
        startActivity(i);
    }

    public void goToLoginPage(View view) {
     Intent i=new Intent(getApplicationContext(),login.class);
     startActivity(i);
    }
}
