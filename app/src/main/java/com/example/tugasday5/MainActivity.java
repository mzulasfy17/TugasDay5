package com.example.tugasday5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] codeitem = {"ipx", "o17", "aa5"};
    private EditText name, itemcode, jumlah;
    private RadioButton gold, silver, bronze;
    private Button finished;
    private RadioGroup customerType;
    private double hargaSetelahdiskon;
    private double memberds;
    private String memberstr;
    private double hargaSetelahmember;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etname);
        gold = findViewById(R.id.rbgold);
        silver = findViewById(R.id.rbsilver);
        bronze = findViewById(R.id.rbbronze);
        itemcode = findViewById(R.id.etitemcode);
        jumlah = findViewById(R.id.etjumlah);
        finished = findViewById(R.id.btfinished);
        customerType = findViewById(R.id.customorType);

        finished.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btfinished) {

            if (itemcode.getText().toString().trim().toUpperCase().equals("IPX")) {
                double harga = 5725300;
                int jumlah2 = Integer.parseInt(jumlah.getText().toString().trim());
                double hargaSetelahjumlah = harga * jumlah2;
                if (hargaSetelahjumlah >= 10000000) {
                    hargaSetelahdiskon = hargaSetelahjumlah - 100000;
                } else {
                    hargaSetelahdiskon = hargaSetelahjumlah;
                }

                if (gold.isChecked()) {
                    memberds = hargaSetelahdiskon * 0.1;
                    memberstr = "Gold";
                } else if (silver.isChecked()) {
                    memberds = hargaSetelahdiskon * 0.05;
                    memberstr = "Silver";
                } else if (bronze.isChecked()) {
                    memberds = hargaSetelahdiskon * 0.02;
                    memberstr = "Bronze";
                }
                hargaSetelahmember = hargaSetelahdiskon - memberds;


                Intent finished = new Intent(MainActivity.this, bon.class);
                finished.putExtra("code", "IPX");
                finished.putExtra("nama", "Iphone X");
                finished.putExtra("harga", " 5.725.300");
                finished.putExtra("totall", hargaSetelahjumlah);
                finished.putExtra("diskon", " 100.000 ");
                finished.putExtra("member", memberds);
                finished.putExtra("total Semua", hargaSetelahmember);
                finished.putExtra("memberstr", memberstr);
                finished.putExtra("NamaP", name.getText().toString().trim());

                startActivity(finished);
            }


        }if (itemcode.getText().toString().trim().toUpperCase().equals("O17")) {
            double harga = 2500999;
            int jumlah2 = Integer.parseInt(jumlah.getText().toString().trim().toUpperCase());
            double hargaSetelahjumlah = harga * jumlah2;
            if (hargaSetelahjumlah >= 10000000) {
                hargaSetelahdiskon = hargaSetelahjumlah - 100000;
            } else {
                hargaSetelahdiskon = hargaSetelahjumlah;
            }

            if (gold.isChecked()) {
                memberds = hargaSetelahdiskon * 0.1;
                memberstr = "Gold";
            } else if (silver.isChecked()) {
                memberds = hargaSetelahdiskon * 0.05;
                memberstr = "Silver";
            } else if (bronze.isChecked()) {
                memberds = hargaSetelahdiskon * 0.02;
                memberstr = "Bronze";
            }
            hargaSetelahmember = hargaSetelahdiskon - memberds;


            Intent finished = new Intent(MainActivity.this, bon.class);
            finished.putExtra("code", "O17");
            finished.putExtra("nama", "Oppo a17");
            finished.putExtra("harga", " 2.500.999");
            finished.putExtra("totall", hargaSetelahjumlah);
            finished.putExtra("diskon", " 100.000 ");
            finished.putExtra("member", memberds);
            finished.putExtra("total Semua", hargaSetelahmember);
            finished.putExtra("memberstr", memberstr);
            finished.putExtra("NamaP", name.getText().toString().trim().toUpperCase());
            startActivity(finished);
        }
        if (itemcode.getText().toString().trim().toUpperCase().equals("AA5")) {
            double harga = 9999999;
            int jumlah2 = Integer.parseInt(jumlah.getText().toString().trim().toUpperCase());
            double hargaSetelahjumlah = harga * jumlah2;
            if (hargaSetelahjumlah >= 10000000) {
                hargaSetelahdiskon = hargaSetelahjumlah - 100000;
            }else {
                hargaSetelahdiskon = hargaSetelahjumlah;
            }

            if (gold.isChecked()){
                memberds = hargaSetelahdiskon * 0.1;
                memberstr = "Gold";
            } else if (silver.isChecked()){
                memberds = hargaSetelahdiskon * 0.05;
                memberstr = "Silver";
            } else if (bronze.isChecked()) {
                memberds = hargaSetelahdiskon * 0.02;
                memberstr = "Bronze";
            }
            hargaSetelahmember = hargaSetelahdiskon - memberds;


            Intent finished = new Intent(MainActivity.this, bon.class);
            finished.putExtra("code", "AA5");
            finished.putExtra("nama", "Acer Aspire V");
            finished.putExtra("harga", " 9.999.999");
            finished.putExtra("totall", hargaSetelahjumlah);
            finished.putExtra("diskon", " 100.000 ");
            finished.putExtra("member", memberds);
            finished.putExtra("total Semua", hargaSetelahmember);
            finished.putExtra("memberstr", memberstr);
            finished.putExtra("NamaP", name.getText().toString().trim().toUpperCase());
            startActivity(finished);
        }
    }
}