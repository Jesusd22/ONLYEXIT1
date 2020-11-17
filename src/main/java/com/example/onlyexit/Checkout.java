package com.example.onlyexit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Checkout extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    TextView textView2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        imageView = findViewById(R.id.ivCheckout);
        textView = findViewById(R.id.tvItemNameCO);
        textView2 = findViewById(R.id.tvPriceCO);
        button = findViewById(R.id.btnBuy);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("textView");
        int receivedImage = intent.getIntExtra("imageView",0);

        textView.setText(receivedName);
        imageView.setImageResource(receivedImage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Thank You for your Purchase!",Toast.LENGTH_LONG).show();
            }
        });

    }
}