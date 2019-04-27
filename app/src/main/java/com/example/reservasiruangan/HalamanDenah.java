package com.example.reservasiruangan;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.reservasiruangan.utils.PreferenceHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.util.Log;
import android.view.View;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HalamanDenah extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    public void p106 (View view){

        Button bebas = (Button) findViewById(R.id.P106);

        String namaruangan = bebas.getText().toString();
        PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        pref.setRuangan(namaruangan);

        if(namaruangan.matches("P106")){

            Intent bebas1 = new Intent(HalamanDenah.this, DetailRuangan.class);
            startActivity(bebas1);
            finish();

        }


    }
    public void n112 (View view){

        Button bebas = (Button) findViewById(R.id.n112);

        String namaruangan = bebas.getText().toString();
        PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        pref.setRuangan(namaruangan);

        if(namaruangan.matches("N112")){

            Intent bebas1 = new Intent(HalamanDenah.this, DetailRuangan.class);
            startActivity(bebas1);
            finish();

        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_denah);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            Intent HalamanAwal = new Intent(HalamanDenah.this, com.example.reservasiruangan.HalamanAwal.class);
            startActivity(HalamanAwal);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.halaman_denah, menu);


        PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        TextView nama = (TextView) findViewById(R.id.ininama);
        TextView email = (TextView) findViewById(R.id.textView) ;
        nama.setText(pref.getNama());
        email.setText(pref.getEmail());
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_booking) {
            // Handle the camera action
            Toast.makeText(this, "HEhehehe", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_setting) {
            Toast.makeText(this, "HEhehehe", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_aboutus) {
            Toast.makeText(this, "HEhehehe", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_logout) {


            new AlertDialog.Builder(HalamanDenah.this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Logout Notification")
                    .setMessage("Apakah anda yakin akan logout?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Intent home = new Intent(HalamanAwal.this,MainActivity.class);
                            //startActivity(home);
                            finish();
                        }
                    })
                    .setNegativeButton("No",null)
                    .show();
            //Toast.makeText(this, "HEhehehe", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
