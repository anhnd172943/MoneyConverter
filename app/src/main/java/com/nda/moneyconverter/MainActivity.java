package com.nda.moneyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    double medtoUSD = 1;
    double medtoVND = 23200.46;
    double medtoEUR = 0.84;
    double medtoGBP = 0.77;
    double medtoJPY = 104.51;
    double medtoCNY = 6.71;
    double medtoRUB = 77.09;
    double medtoHKD = 7.75;
    double medtoCAD = 1.32;
    double medtoTHB = 31.21;
    double res = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner fromSpinner, toSpinner;
        fromSpinner = (Spinner)findViewById(R.id.fromMoney);
        toSpinner = (Spinner)findViewById(R.id.toMoney);

        final EditText getMoney;
        final TextView result;
        getMoney = (EditText)findViewById(R.id.moneyAmount);
        result = (TextView)findViewById(R.id.resultMoney);

        final ArrayList<String> currency = new ArrayList<String>();
        currency.add("VND");
        currency.add("USD");
        currency.add("EUR");
        currency.add("GBP");
        currency.add("JPY");
        currency.add("CNY");
        currency.add("RUB");
        currency.add("HKD");
        currency.add("CAD");
        currency.add("THB");

        final ArrayList<String> currency2 = new ArrayList<String>();
        currency2.add("VND");
        currency2.add("USD");
        currency2.add("EUR");
        currency2.add("GBP");
        currency2.add("JPY");
        currency2.add("CNY");
        currency2.add("RUB");
        currency2.add("HKD");
        currency2.add("CAD");
        currency2.add("THB");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, currency);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, currency2);

        fromSpinner.setAdapter(arrayAdapter);
        toSpinner.setAdapter(arrayAdapter2);

        fromSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (currency.get(position).toString().equals("VND")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoVND;
                }
                if (currency.get(position).toString().equals("USD")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoUSD;
                }
                if (currency.get(position).toString().equals("EUR")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoEUR;
                }
                if (currency.get(position).toString().equals("GBP")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoGBP;
                }
                if (currency.get(position).toString().equals("JPY")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoJPY;
                }
                if (currency.get(position).toString().equals("CNY")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoCNY;
                }
                if (currency.get(position).toString().equals("RUB")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoRUB;
                }
                if (currency.get(position).toString().equals("HKD")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoHKD;
                }
                if (currency.get(position).toString().equals("CAD")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoCAD;
                }
                if (currency.get(position).toString().equals("THB")){
                    res = Double.parseDouble(getMoney.getText().toString())/medtoTHB;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /*toSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(currency2.get(position).toString().equals("VND")){
                    res *= medtoVND;
                }
                if(currency2.get(position).toString().equals("USD")){
                    res *= medtoUSD;
                }
                if(currency2.get(position).toString().equals("EUR")){
                    res *= medtoEUR;
                }
                if(currency2.get(position).toString().equals("GBP")){
                    res *= medtoGBP;
                }
                if(currency2.get(position).toString().equals("JPY")){
                    res *= medtoJPY;
                }
                if(currency2.get(position).toString().equals("CNY")){
                    res *= medtoCNY;
                }
                if(currency2.get(position).toString().equals("RUB")){
                    res *= medtoRUB;
                }
                if(currency2.get(position).toString().equals("CAD")){
                    res *= medtoCAD;
                }
                if(currency2.get(position).toString().equals("HKD")){
                    res *= medtoHKD;
                }
                if(currency2.get(position).toString().equals("THB")){
                    res *= medtoTHB;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/

        getMoney.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


                result.setText("" + res);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}