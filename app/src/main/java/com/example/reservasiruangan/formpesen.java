package com.example.reservasiruangan;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.reservasiruangan.utils.PreferenceHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class formpesen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public TextView nama,nim,ruangan, nama2, tanggal;
    public PreferenceHelper pref;
    public DatePickerDialog datePickerDialog;
    public SimpleDateFormat dateFormatter;
    public ImageView kalender;

    public void showDateDialog(View view){

        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(formpesen.this, new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                tanggal.setText(dateFormatter.format(newDate.getTime()));

            }


        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formpesen);

        pref = new PreferenceHelper(getApplicationContext());
        nama = (TextView) findViewById(R.id.textNamaget);
        nim = (TextView) findViewById(R.id.textNIMget);
        ruangan = (TextView) findViewById(R.id.ruangan);
        nama.setText(pref.getNama());
        nim.setText(pref.getEmail());
        ruangan.setText(pref.getRuangan());

        //Definissin Spinner
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        //spin.setOnItemClickListener(this);
        ArrayList<String> shift = new ArrayList<String>();
        shift.add("06.30");
        shift.add("09.30");
        shift.add("12.30");
        shift.add("15.30");

        //Spinner Pertama
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,shift);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(arrayAdapter);
        spin2.setAdapter(arrayAdapter);


        //onNothingSelected();

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.JAPANESE);
        tanggal = (TextView) findViewById(R.id.texttanggalget);
        kalender = (ImageView) findViewById(R.id.imageView6);
        /*kalender.setOnClickListener(new View.OnClickListener(){

            public void onClick2(View view){
                showDateDialog();

            }

        });*/




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
/*
    private void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this,"Silahkan pilih shift ",Toast.LENGTH_SHORT).show();
    }

*/



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            Intent variable = new Intent(formpesen.this,DetailRuangan.class);
            startActivity(variable);
            finish();
            //super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.formpesen, menu);
        pref = new PreferenceHelper(getApplicationContext());
        nama2 = (TextView) findViewById(R.id.ininama);
        TextView email = (TextView) findViewById(R.id.textView) ;
        nama2.setText(pref.getNama());
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

            Intent cacat = new Intent(formpesen.this,aboutus.class);
            startActivity(cacat); finish();
        } else if (id == R.id.nav_logout) {

            new AlertDialog.Builder(formpesen.this)
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
