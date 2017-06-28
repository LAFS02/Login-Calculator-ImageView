package com.lmntrx.android.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        double result = getIntent().getDoubleExtra("RESULT",0);

        ImageView imageView = (ImageView) findViewById(R.id.resultImageView);

        if (result % 2 == 0){
            imageView.setImageResource(R.drawable.two);
        }else if (result % 3 == 0){
            imageView.setImageResource(R.drawable.three);
        }else if (result % 5 == 0){
            imageView.setImageResource(R.drawable.five);
        }else {
            Toast.makeText(this, "None", Toast.LENGTH_SHORT).show();
        }

    }
}
