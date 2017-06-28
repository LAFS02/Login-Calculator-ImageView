package com.lmntrx.android.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {

        EditText usernameET = (EditText) findViewById(R.id.usernameET);
        EditText passwordET = (EditText) findViewById(R.id.passwordET);

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();

        if (username.equals("livin") && password.equals("1234")){
            Intent intent = new Intent(this, CalculatorActivity.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(this, "Invalid username or password!", Toast.LENGTH_SHORT).show();
        }
    }
}
