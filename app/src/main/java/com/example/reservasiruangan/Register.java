package com.example.reservasiruangan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class Register extends AppCompatActivity {

    EditText usernametext, passwordtext, namalengkap, email;

    public void daftar(View view){

        usernametext = (EditText) findViewById(R.id.editTextusername);
        passwordtext = (EditText) findViewById(R.id.passwordtext);
        namalengkap = (EditText) findViewById(R.id.editTextnamalengkap);
        email = (EditText) findViewById(R.id.emailtext);

        String usernamestring = usernametext.getText().toString();
        String passwordstring = passwordtext.getText().toString();
        String namalengkapstring = namalengkap.getText().toString();
        String emailstring = email.getText().toString();

        if (usernamestring.matches("") || passwordstring.matches("") || namalengkapstring.matches("")
                || emailstring.matches("")){

            Toast.makeText(Register.this,"Harap isi semua form terlebih dahulu.", Toast.LENGTH_SHORT).show();

        }else {

            ParseUser user = new ParseUser();
            user.setUsername(usernamestring);
            user.setPassword(passwordstring);
            user.setEmail(emailstring);
            user.put("nama",namalengkapstring);

            ParseObject<ParseObject>  = new ParseObject("TABEL")
            user.signUpInBackground(new SignUpCallback() {
                @Override
                public void done(ParseException e) {
                    if(e == null){

                        Toast.makeText(Register.this,"Register Berhasil! Silahkan coba login :)",Toast.LENGTH_SHORT).show();
                        usernametext.setText("");
                        passwordtext.setText("");;
                        namalengkap.setText("");;
                        email.setText("");;

                    }

                    else{
                            //Log.i()
                            Toast.makeText(Register.this, e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }
}
