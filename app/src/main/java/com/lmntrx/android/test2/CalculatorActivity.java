package com.lmntrx.android.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    EditText numET1, numET2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        numET1 = (EditText) findViewById(R.id.num1);
        numET2 = (EditText) findViewById(R.id.num2);
    }

    public void add(View view) {
        double a = Double.parseDouble(numET1.getText().toString());
        double b = Double.parseDouble(numET1.getText().toString());

        double result = a + b;

        sendResult(result);

    }

    public void subtract(View view) {
        double a = Double.parseDouble(numET1.getText().toString());
        double b = Double.parseDouble(numET1.getText().toString());

        double result = a - b;

        sendResult(result);
    }

    public void multiply(View view) {
        double a = Double.parseDouble(numET1.getText().toString());
        double b = Double.parseDouble(numET1.getText().toString());

        double result = a * b;

        sendResult(result);
    }

    public void divide(View view) {
        double a = Double.parseDouble(numET1.getText().toString());
        double b = Double.parseDouble(numET1.getText().toString());

        double result = a / b;

        sendResult(result);
    }

    private void sendResult(double result) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("RESULT",result);
        startActivity(intent);
    }
}
