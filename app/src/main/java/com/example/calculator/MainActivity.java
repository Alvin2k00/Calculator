package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addition = findViewById(R.id.addition);
        addition.setOnClickListener(v -> {
            EditText enternumber1 = findViewById(R.id.enternumber1);
            EditText enternumber2 = findViewById(R.id.enternumber2);
            double a = Double.parseDouble(enternumber1.getText().toString());
            double b = Double.parseDouble(enternumber2.getText().toString());
            double c = a + b;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            enternumber1.setText(formatVal.format(c));

        });
        Button subtraction = findViewById(R.id.subtraction);
        subtraction.setOnClickListener(v -> {
            EditText enternumber1 = findViewById(R.id.enternumber1);
            EditText enternumber2 = findViewById(R.id.enternumber2);
            double a = Double.parseDouble(enternumber1.getText().toString());
            double b = Double.parseDouble(enternumber2.getText().toString());
            double c = a - b;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            enternumber1.setText(formatVal.format(c));
        });
        Button multiplication = findViewById(R.id.multiplication);
        multiplication.setOnClickListener(v -> {
            EditText enternumber1 = findViewById(R.id.enternumber1);
            EditText enternumber2 = findViewById(R.id.enternumber2);
            double a = Double.parseDouble(enternumber1.getText().toString());
            double b = Double.parseDouble(enternumber2.getText().toString());
            double c = a * b;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            enternumber1.setText(formatVal.format(c));
        });
        Button divide = findViewById(R.id.divide);
        divide.setOnClickListener(v -> {
            EditText enternumber1 = findViewById(R.id.enternumber1);
            EditText enternumber2 = findViewById(R.id.enternumber2);
            double a = Double.parseDouble(enternumber1.getText().toString());
            double b = Double.parseDouble(enternumber2.getText().toString());
            double c = a / b;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            enternumber1.setText(formatVal.format(c));
        });
        Button remainder = findViewById(R.id.remainder);
        remainder.setOnClickListener(v -> {
            EditText enternumber1 = findViewById(R.id.enternumber1);
            EditText enternumber2 = findViewById(R.id.enternumber2);
            double a = Double.parseDouble(enternumber1.getText().toString());
            double b = Double.parseDouble(enternumber2.getText().toString());
            double c = a % b;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            enternumber1.setText(formatVal.format(c));
        });
    }
}