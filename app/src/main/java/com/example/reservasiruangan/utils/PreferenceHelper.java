package com.example.reservasiruangan.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {
    private String key = "Revinganteng";

    SharedPreferences settings;
    SharedPreferences.Editor editor;

    public PreferenceHelper(Context context) {
        settings = context.getSharedPreferences(key, 0);
        editor = settings.edit();
    }

    public void setNama(String nama) {
        editor.putString("nama", nama);
        editor.apply();
    }
    public void setEmail(String email){
        editor.putString("email", email);
        editor.apply();
    }
    public void setRuangan(String ruangan){
        editor.putString("ruangan", ruangan);
        editor.apply();
    }
    public void setUsername(String username){
        editor.putString("username", username);
        editor.apply();
    }
    public void setKeterangan(String keterangan){
        editor.putString("keterangan", keterangan);
        editor.apply();
    }
    public void settanggal(String tanggal){
        editor.putString("tanggal", tanggal);
        editor.apply();
    }
    public void setfidgetspinner1(String fidgetspinner1){
        editor.putString("fidgetspinnger1", fidgetspinner1);
        editor.apply();
    }
    public void setfidgetspinner2(String fidgetspinner2){
        editor.putString("fidgetspinnger2", fidgetspinner2);
        editor.apply();
    }
    public void sethp(String hp){
        editor.putString("hp", hp);
        editor.apply();
    }


    public String getNama() {
        return settings.getString("nama", "_");
    }

    public String getEmail() {
        return settings.getString("email", "_");
    }

    public String getRuangan() { return settings.getString("ruangan","_"); }

    public String getUsername() {return settings.getString("username","_"); }

    public String getKeterangan(){return settings.getString("keterangan","_");}

    public String gettanggal(){return settings.getString("tanggal","_");}

    public String getfidgetspinner1(){return settings.getString("fidgetspinner1","_");}

    public String getfidgetspinner2(){return settings.getString("fidgetspinner2","_");}

    public String gethp(){return settings.getString("hp","_");}
}
