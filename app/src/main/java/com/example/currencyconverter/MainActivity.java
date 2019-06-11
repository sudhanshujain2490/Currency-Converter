package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ConvertCurrency(View view)
    {
        EditText currencyEditText = (EditText) findViewById(R.id.CurrencyEditText);

        Double d = Double.parseDouble(currencyEditText.getText().toString());

        Double rupesAmount = d*70;

        Toast.makeText(MainActivity.this, "Rs." + rupesAmount.toString(), Toast.LENGTH_LONG).show();

        Log.i("amount", currencyEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
