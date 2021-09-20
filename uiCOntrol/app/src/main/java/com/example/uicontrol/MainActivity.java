package com.example.uicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nama, no;
    CheckBox status;
    RadioButton gol1, gol2;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.ed_nama);
        no = (EditText) findViewById(R.id.ed_nomor);
        status = (CheckBox) findViewById(R.id.cb_menikah);
        gol1 = (RadioButton) findViewById(R.id.rb_gol1);
        gol2 = (RadioButton) findViewById(R.id.rb_gol2);
        hitung = (Button) findViewById(R.id.bt_hasil);
        hasil = (TextView) findViewById(R.id.tv_hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(status.isChecked() && gol1.isChecked()) {
                    float gaji = (float) (1.2 * 2000000);
                    hasil.setText("Gaji Katyawan " + nama.getText() + no.getText() + gaji);
                } else if(status.isChecked() && gol2.isChecked()) {
                    float gaji = (float) (1.2 * 1500000);
                    hasil.setText("Gaji Katyawan " + nama.getText() + no.getText() + gaji);
                } else if(gol1.isChecked()) {
                    hasil.setText("Gaji Katyawan " + nama.getText() + no.getText() + 2000000);
                } else if(gol2.isChecked()) {
                    hasil.setText("Gaji Katyawan " + nama.getText() + no.getText() + 1500000);
                }
            }
        });
    }
}

