package com.zaenalanzarry.utspraktik_if1_10118023_zaenalanzarry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class IsianData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isian_data);
        TextView tvData1 = (TextView) findViewById(R.id.txt_isinik);
        TextView tvData2 = (TextView) findViewById(R.id.txt_isinama);
        TextView tvData3 = (TextView) findViewById(R.id.txt_isitanggal);
        TextView tvData4 = (TextView) findViewById(R.id.txt_isijk);
        TextView tvData5 = (TextView) findViewById(R.id.txt_isihub);

        //
        tvData1.setText(getIntent().getStringExtra("data1"));
        tvData2.setText(getIntent().getStringExtra("data2"));
        tvData3.setText(getIntent().getStringExtra("data3"));
        tvData4.setText(getIntent().getStringExtra("data4"));
        tvData5.setText(getIntent().getStringExtra("data5"));

    }

    public void pindahkesimpan(View view) {
        Intent intent = new Intent(IsianData.this, hasil.class);
        startActivity(intent);
    }

    public void pindahkeubah(View view) {
        Intent intent = new Intent(IsianData.this, MainActivity.class);
        startActivity(intent);
    }
}