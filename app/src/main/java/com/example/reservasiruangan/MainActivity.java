package com.example.reservasiruangan;

import android.content.Intent;
import android.drm.DrmStore;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

import static android.util.Log.*;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
        MainActivity.class.getSimpleName();


    public void fade(View view){
        ImageView ftemalam = (ImageView) findViewById(R.id.gambar1);

        ftemalam.animate().alpha(0f).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {

        EditText uname = (EditText) findViewById(R.id.uname);
        EditText pass = (EditText) findViewById(R.id.pass);

        String username = uname.getText().toString();
        String password = pass.getText().toString();

        if(username.isEmpty() || password.isEmpty()){

            Toast.makeText(MainActivity.this,"Harap isi username dan password",Toast.LENGTH_SHORT).show();
        }

        else if (username.equals("revinnaufal") && password.equals("123456789")){

            Log.d(LOG_TAG, "Button Clicked!");

            Toast.makeText(MainActivity.this,"Selamat Datang "+username,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, HalamanAwal.class);
            startActivity(intent);
        }



    }
}
