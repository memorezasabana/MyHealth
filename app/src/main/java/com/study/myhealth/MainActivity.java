package com.study.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInfoCovid =findViewById(R.id.btn_info_covid19);
        btnInfoCovid.setOnClickListener(this);

        Button btnCaraMencuciTangan =findViewById(R.id.btn_cara_mencuci_tangan);
        btnCaraMencuciTangan.setOnClickListener(this);

        Button btnCaraMemakaiMasker = findViewById(R.id.btn_cara_memakai_masker);
        btnCaraMemakaiMasker.setOnClickListener(this);

        Button btnPolaHidupSehat =findViewById(R.id.btn_pola_hidup_sehat);
        btnPolaHidupSehat.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_telp);
        btnDialPhone.setOnClickListener(this);
    }
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btn_info_covid19:
                Intent moveIntent = new Intent(MainActivity.this,
                        MoveActivity.class);
                startActivity(moveIntent);
                break;

             case R.id.btn_cara_mencuci_tangan:
                 Intent moveIntent2 = new Intent(MainActivity.this,
                        MoveActivity2.class);
                startActivity(moveIntent2);
                break;
             case R.id.btn_cara_memakai_masker:
                Intent moveIntent3 = new Intent(MainActivity.this,
                        MoveActivity3.class);
                startActivity(moveIntent3);
                break;
            case R.id.btn_pola_hidup_sehat:
                Intent moveIntent4 = new Intent(MainActivity.this,
                        MoveActivity4.class);
                startActivity(moveIntent4);
                break;
            case R.id.btn_telp:
                String phoneNumber = "081212123119";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

        }
    }
}