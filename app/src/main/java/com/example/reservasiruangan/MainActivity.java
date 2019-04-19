package com.example.reservasiruangan;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.reservasiruangan.utils.PreferenceHelper;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener {

    private static final String LOG_TAG =
        MainActivity.class.getSimpleName();

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_ENTER &&  event.getAction() == KeyEvent.ACTION_DOWN){

            launchSecondActivity(v);

        }
        return false;
    }


    public void fade(View view){
        ImageView ftemalam = (ImageView) findViewById(R.id.gambar1);

        ftemalam.animate().alpha(0f).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ParseObject testing = new ParseObject("testing");
        //testing.put("Username", "coba");
        //testing.put("Password","1234567");
        //testing.saveInBackground();

        EditText pass = (EditText) findViewById(R.id.pass);
        pass.setOnKeyListener(this);


    }

    public void launchSecondActivity(View view) {

        EditText uname = (EditText) findViewById(R.id.uname);
        EditText pass = (EditText) findViewById(R.id.pass);

        String username = uname.getText().toString();
        String password = pass.getText().toString();

        //final ParseQuery<ParseObject> query = ParseQuery.getQuery("User");



        if(username.matches("") || password.matches("")){

            Toast.makeText(MainActivity.this,"Harap isi username dan password",Toast.LENGTH_SHORT).show();
        }else{

            ParseUser.logInInBackground(username, password, new LogInCallback() {
                @Override
                public void done(ParseUser user, ParseException e) {

                    if(user != null){

                        String inistring = user.getString("nama");

                        Toast.makeText(MainActivity.this,"Login berhasil. Selamat Datang\n" +inistring,Toast.LENGTH_SHORT).show();
                        Intent halamanawal = new Intent(MainActivity.this, HalamanAwal.class);
                        startActivity(halamanawal);

                        String namastring = user.getString("nama");
                        String emailstring = user.getString("email");

                        PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
                        pref.setNama(namastring);
                        pref.setEmail(emailstring);


                    }else{
                        Toast.makeText(MainActivity.this, e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

        /*else if (username.equals("revinnaufal") && password.equals("123456789")){

            Log.d(LOG_TAG, "Button Clicked!");

            Toast.makeText(MainActivity.this,"Selamat Datang "+username,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, HalamanAwal.class);
            startActivity(intent);
            PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
            pref.setNama(username);
            pref.setEmail(password);

        }*/
    }
    public void masukregist(View view){
        Intent masuk = new Intent(this, Register.class);
        startActivity(masuk);



    }


}
