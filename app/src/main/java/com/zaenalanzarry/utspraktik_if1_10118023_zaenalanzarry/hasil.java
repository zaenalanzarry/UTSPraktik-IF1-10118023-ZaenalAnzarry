package com.zaenalanzarry.utspraktik_if1_10118023_zaenalanzarry;

/*
    Tanggal Pengerjaan : 5 Juni 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF1/S1/VI
*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
    }

    public void pindahkeawal(View view) {
        Intent intent = new Intent(hasil.this, MainActivity.class);
        startActivity(intent);
    }
}
