package com.example.reservasiruangan;

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
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DetailRuangan extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public void menujukeform(View view){

        Intent lalala = new Intent(this, formpesen.class);
        startActivity(lalala);
        finish();


    }
    public TextView namaruangan,spesifikasi;

    public TextView namaruangan,spesifikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ruangan);

        PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        namaruangan = (TextView) findViewById(R.id.ancol);
        spesifikasi = findViewById(R.id.spesifikasi);
        String kotakbantu = pref.getRuangan();
<<<<<<< HEAD

        //IF ELSE BUAT RUANGAN
        if (kotakbantu.matches("P107")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTerdapat 50 Bangku\n"+
                    "2.\tPapan Tulis Mantap");

        }
        else if(kotakbantu.matches("P313")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya ademmmmmmmmmm\n"+
                    "2.\tPapan Tulis Mantap");

        }
        else if(kotakbantu.matches("P401")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya ademmmmmmmmmm sari\n"+
                    "2.\tPapan Tulis Mantap mantul mantul sekali");

        }
        else if(kotakbantu.matches("P402")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya sempit banget\n"+
                    "2.\tPapan Tulis ancur ");

        }
        else if(kotakbantu.matches("P403")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya jauh\n"+
                    "2.\tPapan Tulis gabisa dihapus");

        }
        else if(kotakbantu.matches("P404")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya para kucing berkeliaran\n"+
                    "2.\tPapan Tulis tercakar kocheng");

        }
        else if(kotakbantu.matches("P405")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya tinggi, tinggi sekaleeee\n"+
                    "2.\tPapan Tulis Mantap banyak pohon cemara");

        }
        else if(kotakbantu.matches("P406")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya gak bisa dibuka\n"+
                    "2.\tPapan Tulis ilang");

        }
        else if(kotakbantu.matches("N112")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya enak\n"+
                    "2.\tPapan Tulis Mantap");

        }
        else if(kotakbantu.matches("N309")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya luas\n"+
                    "2.\tPapan Tulis memantap dan memantul");

        }
        else if(kotakbantu.matches("N313")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya bersih\n"+
                    "2.\tPapan Tulis Mantap mantap mantap");

        }
        else if(kotakbantu.matches("O101")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya kane\n"+
                    "2.\tPapan Tulis mantul");

        }

        //PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        //TextView namaruangan = (TextView) findViewById(R.id.ancol);
        //TextView lala = findViewById(R.id.spesifikasi);
        //String namaruangan = namaruanganbelumstring.toString();

        //lala.setText("WAW");
        //namaruangan.setText("P106");
        //Toast.makeText(this,pref.getRuangan(),Toast.LENGTH_LONG).show();
=======

        //IF ELSE BUAT RUANGAN
        if (kotakbantu.matches("P106")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTerdapat 50 Bangku\n"+
                    "2.\tPapan Tulis Mantap");
>>>>>>> e1511372c709307a2ef40b6f085d337a68d1d00e

        } else if(kotakbantu.matches("N112")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya enak\n"+
                    "2.\tPapan Tulis Mantap");

<<<<<<< HEAD
        //setContentView(R.layout.activity_detail_ruangan);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
=======
        }




        Toast.makeText(this,pref.getRuangan(),Toast.LENGTH_LONG).show();
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
>>>>>>> e1511372c709307a2ef40b6f085d337a68d1d00e


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            Intent variabel = new Intent(DetailRuangan.this, HalamanDenah.class);
            startActivity(variabel);
            finish();
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detail_ruangan, menu);
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

            Intent cacat = new Intent(DetailRuangan.this,aboutus.class);
            startActivity(cacat); finish();
        } else if (id == R.id.nav_logout) {

            new AlertDialog.Builder(DetailRuangan.this)
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
