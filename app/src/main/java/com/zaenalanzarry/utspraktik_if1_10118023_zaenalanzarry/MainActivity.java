package com.zaenalanzarry.utspraktik_if1_10118023_zaenalanzarry;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult;
    private EditText btDatePicker;

    private void showDateDialog() {
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                tvDateResult.setText(dateFormatter.format(newDate.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        final EditText nik = (EditText) findViewById(R.id.tfield_nik);
        final EditText nama = (EditText) findViewById(R.id.tfield_nama);
        final EditText tanggal = (EditText) findViewById(R.id.tfield_tanggal);
        final RadioGroup jk = (RadioGroup) findViewById(R.id.r_jk);
        final RadioGroup hub = (RadioGroup) findViewById(R.id.r_hub);
        EditText tanggalcoba = (EditText) findViewById(R.id.tfield_tanggal);


        Button btSubmit = (Button) findViewById(R.id.btnselanjutnya);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IsianData.class);
                intent.putExtra("data1", nik.getText().toString());
                intent.putExtra("data2", nama.getText().toString());
                intent.putExtra("data3", tanggal.getText().toString());

                int gender = jk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                intent.putExtra("data4", jk.getText().toString());

                int hubungan = hub.getCheckedRadioButtonId();
                RadioButton hub = (RadioButton) findViewById(hubungan);
                intent.putExtra("data5", hub.getText().toString());
                startActivity(intent);
            }
        });

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        tanggalcoba = (EditText) findViewById(R.id.tfield_tanggal);
        tanggalcoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });
    }
}