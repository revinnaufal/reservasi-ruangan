package com.example.reservasiruangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.reservasiruangan.utils.PreferenceHelper;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class detailbooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailbooking);

        PreferenceHelper pref = new PreferenceHelper(getApplicationContext());
        TextView judul2 = (TextView) findViewById(R.id.judul2);
        judul2.setText(pref.getRuangan());

        final ListView listviewmantap = (ListView) findViewById(R.id.listviewmantap);

        ParseQuery<ParseObject> query = ParseQuery.getQuery("tabelbookruangan");

        query.whereEqualTo("nim",pref.getUsername());
        query.whereEqualTo("ruangan", pref.getRuangan());

        final ArrayList<String> array = new ArrayList<String>();
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e == null){


                    if (objects.size()>0){
                        for (ParseObject tabelbookruangan:objects){

                            array.add("Nama : "+tabelbookruangan.getString("nama"));
                            array.add("NIM : "+tabelbookruangan.getString("nim"));
                            array.add("No. Handphone : "+tabelbookruangan.getString("nohp"));
                            array.add("Keterangan :\n"+tabelbookruangan.getString("keterangan"));
                            array.add("Tanggal Peminjaman : "+tabelbookruangan.getString("tanggalpeminjaman"));
                            array.add("Jam : "+tabelbookruangan.getString("waktupinejm"));
                            array.add("DIbooking pada jam: "+tabelbookruangan.getString("dipinjampada"));
                        }
                        ArrayAdapter arrayAdapter = new ArrayAdapter(detailbooking.this, android.R.layout.simple_list_item_1, array);
                        listviewmantap.setAdapter(arrayAdapter);
                    }

                }
            }
        });

    }
}
