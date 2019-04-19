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

    public String getNama() {
        return settings.getString("nama", "_");
    }

    public String getEmail() {
        return settings.getString("email", "_");
    }
}
