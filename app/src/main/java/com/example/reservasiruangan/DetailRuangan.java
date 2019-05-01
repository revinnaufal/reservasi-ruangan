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
import android.widget.ImageView;
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
    public ImageView kotakbantuimage1;
    public ImageView kotakbantuimage2;
    public ImageView kotakbantuimage3;
    public ImageView kotakbantuimage4;

    // TextView namaruangan,spesifikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ruangan);


        PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        namaruangan = (TextView) findViewById(R.id.ancol);
        spesifikasi = findViewById(R.id.spesifikasi);
        kotakbantuimage1 = (ImageView) findViewById(R.id.imageView1);
        kotakbantuimage2 = (ImageView) findViewById(R.id.imageView2);
        kotakbantuimage3 = (ImageView) findViewById(R.id.imageView3);
        kotakbantuimage4 = (ImageView) findViewById(R.id.imageView4);



        String kotakbantu = pref.getRuangan();

        //IF ELSE BUAT RUANGAN
        if (kotakbantu.matches("P107")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.pppp);
            kotakbantuimage2.setImageResource(R.drawable.p);
            kotakbantuimage3.setImageResource(R.drawable.pp);
            kotakbantuimage4.setImageResource(R.drawable.ppp);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 50\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n");

        }
        else if(kotakbantu.matches("P313")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.b);
            kotakbantuimage2.setImageResource(R.drawable.bb);
            kotakbantuimage3.setImageResource(R.drawable.bbb);
            kotakbantuimage4.setImageResource(R.drawable.bbbb);
            spesifikasi.setText(
                    "1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 45\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");

        }
        else if(kotakbantu.matches("P401")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.ccc);
            kotakbantuimage2.setImageResource(R.drawable.cccc);
            kotakbantuimage3.setImageResource(R.drawable.ccccc);
            kotakbantuimage4.setImageResource(R.drawable.cccccc);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 40\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");

        }
        else if(kotakbantu.matches("P402")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.d1);
            kotakbantuimage2.setImageResource(R.drawable.d2);
            kotakbantuimage3.setImageResource(R.drawable.d3);
            kotakbantuimage4.setImageResource(R.drawable.d4);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 40\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");

        }
        else if(kotakbantu.matches("P403")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.e1);
            kotakbantuimage2.setImageResource(R.drawable.e2);
            kotakbantuimage3.setImageResource(R.drawable.e3);
            kotakbantuimage4.setImageResource(R.drawable.e4);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 40\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");
        }
        else if(kotakbantu.matches("P404")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.f1);
            kotakbantuimage2.setImageResource(R.drawable.f2);
            kotakbantuimage3.setImageResource(R.drawable.f3);
            kotakbantuimage4.setImageResource(R.drawable.f4);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 40\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");

        }
        else if(kotakbantu.matches("P405")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.g1);
            kotakbantuimage2.setImageResource(R.drawable.g2);
            kotakbantuimage3.setImageResource(R.drawable.g3);
            kotakbantuimage4.setImageResource(R.drawable.g4);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 40\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");

        }
        else if(kotakbantu.matches("P406")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.h1);
            kotakbantuimage2.setImageResource(R.drawable.h2);
            kotakbantuimage3.setImageResource(R.drawable.h3);
            kotakbantuimage4.setImageResource(R.drawable.h4);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 40\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");

        }
        else if(kotakbantu.matches("N112")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.n);
            kotakbantuimage2.setImageResource(R.drawable.nn);
            kotakbantuimage3.setImageResource(R.drawable.nnn);
            kotakbantuimage4.setImageResource(R.drawable.nnnn);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 60\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n");

        }
        else if(kotakbantu.matches("N309")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.i1);
            kotakbantuimage2.setImageResource(R.drawable.i2);
            kotakbantuimage3.setImageResource(R.drawable.i3);
            kotakbantuimage4.setImageResource(R.drawable.i4);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 50\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak da\n");

        }
        else if(kotakbantu.matches("N313")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.j1);
            kotakbantuimage2.setImageResource(R.drawable.j2);
            kotakbantuimage3.setImageResource(R.drawable.j3);
            kotakbantuimage4.setImageResource(R.drawable.j4);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 50\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Tidak ada\n");

        }
        else if(kotakbantu.matches("O101")){
            namaruangan.setText(kotakbantu);
            kotakbantuimage1.setImageResource(R.drawable.a);
            kotakbantuimage2.setImageResource(R.drawable.aa);
            kotakbantuimage3.setImageResource(R.drawable.aaa);
            kotakbantuimage4.setImageResource(R.drawable.aaaa);
            spesifikasi.setText("1.\tJumlah Kursi\t\t\t\t\t\t\t\t\t\t: 60\n"+
                    "2.\tProyektor\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "3.\tKabel Proyektor\t\t\t\t\t\t\t\t: HDMI&VGA\n"+
                    "4.\tPapan Tulis\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n"+
                    "5.\tSpidol dan Penghapus\t: Ada\n"+
                    "6.\tAC\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t: Ada\n");

        }

        //PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        //TextView namaruangan = (TextView) findViewById(R.id.ancol);
        //TextView lala = findViewById(R.id.spesifikasi);
        //String namaruangan = namaruanganbelumstring.toString();

        //lala.setText("WAW");
        //namaruangan.setText("P106");
        //Toast.makeText(this,pref.getRuangan(),Toast.LENGTH_LONG).show();

        //IF ELSE BUAT RUANGAN
        if (kotakbantu.matches("P106")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTerdapat 50 Bangku\n"+
                    "2.\tPapan Tulis Mantap");

        } else if(kotakbantu.matches("N112")){
            namaruangan.setText(kotakbantu);
            spesifikasi.setText("1.\tTempatnya enak\n"+
                    "2.\tPapan Tulis Mantap");

        //setContentView(R.layout.activity_detail_ruangan);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        }




        //Toast.makeText(this,pref.getRuangan(),Toast.LENGTH_LONG).show();
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
            //Toast.makeText(this, "HEhehehe", Toast.LENGTH_SHORT).show();
            Intent mybooking = new Intent(DetailRuangan.this, com.example.reservasiruangan.mybooking.class);
            startActivity(mybooking);
            finish();

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
