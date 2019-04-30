package com.example.reservasiruangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reservasiruangan.utils.PreferenceHelper;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReceiptReview extends AppCompatActivity {

    public PreferenceHelper pref;
    public TextView namanamanama,nim,ruangann,handphonecaw,ketaranganpinjem,tanggallll,jamsekarangbanget,inispin1,inispin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_review);
        pref = new PreferenceHelper(getApplicationContext());

        namanamanama = (TextView) findViewById(R.id.namaget);
        nim = (TextView) findViewById(R.id.nimge);
        ruangann = (TextView) findViewById(R.id.ruanganget);
        tanggallll = (TextView) findViewById(R.id.dateget);
        ketaranganpinjem = (TextView) findViewById(R.id.keteranganget) ;
        handphonecaw = (TextView) findViewById(R.id.nohpget);
        jamsekarangbanget = (TextView) findViewById(R.id.jamnowget);
        inispin1 = (TextView) findViewById(R.id.spin1);
        inispin2 = (TextView) findViewById(R.id.spin2);


        //DEFINISIIN JAM SEKARANG
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat cacad = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat currentdate = new SimpleDateFormat("dd-MM-yyyy");
        String time = "Current Time : "+cacad.format(calendar.getTime());
            /*Calendar calendar = Calendar.getInstance();
            SimpleDateFormat cacad = new SimpleDateFormat(cacad.format(calendar.getTime()));*/
        String date = currentdate.format(calendar.getTime());
        //Toast.makeText(this,time,Toast.LENGTH_LONG).show();
        //DEFINISIIN JAM SEKARANG BERES

        namanamanama.setText(pref.getNama());
        nim.setText(pref.getUsername());
        ruangann.setText(pref.getRuangan());
        tanggallll.setText(pref.gettanggal());
        ketaranganpinjem.setText(pref.getKeterangan());
        handphonecaw.setText(pref.gethp());
        inispin1.setText(pref.getfidgetspinner1());
        inispin2.setText(pref.getfidgetspinner2());
        jamsekarangbanget.setText(date + ", "+cacad.format(calendar.getTime()));




        //Toast.makeText(this,pref.getRuangan(),Toast.LENGTH_SHORT).show();


    }

    public void createPDF(View view){
        TextView judul = (TextView) findViewById(R.id.Judul);
        TextView namatext1 = (TextView) findViewById(R.id.namatext);
        TextView namatext2 = (TextView) findViewById(R.id.namaget);
        TextView nimtext1 = (TextView) findViewById(R.id.NIM);
        TextView nimtext2 = (TextView) findViewById(R.id.nimge);
        TextView ruangan1 = (TextView) findViewById(R.id.ruangan);
        TextView ruangan2 = (TextView) findViewById(R.id.ruanganget);
        TextView keterangan1 = (TextView) findViewById(R.id.keterangan);
        TextView keterangan2 = (TextView) findViewById(R.id.keteranganget);
        TextView tanggal1 = (TextView) findViewById(R.id.peminjaman);
        TextView tanggal2 = (TextView) findViewById(R.id.dateget);
        TextView jampinjem1 = (TextView) findViewById(R.id.jampinjemget);
        TextView jampinjem2 = (TextView) findViewById(R.id.spin1);
        TextView jampinjem3 = (TextView) findViewById(R.id.sd);
        TextView jampinjem4 = (TextView) findViewById(R.id.spin2);
        TextView jamnow1 = (TextView) findViewById(R.id.jamnow);
        TextView jamnow2 = (TextView) findViewById(R.id.jamnowget);

        //String namatext2string = pref.getRuangan();


        //Integer newlala = lala.setTextSize(18);
        //String newnewlala = newlala.toString();
        //String cobanamasiapaini = pref.getNama();

        Document doc = new Document();
        String outpath = Environment.getExternalStorageDirectory()+"/order.pdf";
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(outpath));
            doc.open();
            doc.add(new Paragraph("\t"+judul.getText().toString()+"\n\n"));
            doc.add(new Paragraph(namatext1.getText().toString()+"\t\t\t\t\t\t\t\t\t\t\t\t\t:\t"+ namatext2.getText().toString()));
            doc.add(new Paragraph(nimtext1.getText().toString()+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t:\t"+nimtext2.getText().toString()));
            doc.add(new Paragraph(ruangan1.getText().toString()+"\t\t\t\t\t\t\t\t\t\t\t:\t"+ruangan2.getText().toString()));
            doc.add(new Paragraph(keterangan1.getText().toString()+"\t:"+"\n"+keterangan2.getText().toString()));
            doc.add(new Paragraph(tanggal1.getText().toString()+":\t"+tanggal2.getText().toString()));
            doc.add(new Paragraph(jampinjem1.getText().toString()+"\t\t\t\t\t\t\t:\t"+jampinjem2.getText().toString()
                    +jampinjem3.getText().toString()+jampinjem4.getText().toString()));
            doc.add(new Paragraph(jamnow1.getText().toString()+"\t\t\t\t\t:\t"+jamnow2.getText().toString()));
            doc.close();
            //Date currentTime = Calendar.getInstance().getTime().toString();
            //Toast.makeText(this,currentTime,Toast.LENGTH_LONG).show();
            Toast.makeText(this,"PDF BERHASIL DIBUAT :)",Toast.LENGTH_SHORT).show();


            //Toast.makeText(this,"GENERATE BERHASIL",Toast.LENGTH_SHORT).show();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
