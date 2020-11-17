package com.example.onlyexit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class itemDetails extends AppCompatActivity {


    String [] itemtype = {"beanie", "tshirt", "hoodie", "jeans", "socks"};

    int [] itemImage = {R.drawable.beanie, R.drawable.tshirt, R.drawable.hoodie, R.drawable.jeans, R.drawable.socks};

    ImageView imageView;
    TextView textView;
    TextView textView2;
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    EditText editText;
    Button button;
    FloatingActionButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        imageView = findViewById(R.id.ivItemDetail);
        textView = findViewById(R.id.tvItemSize);
        checkBox = findViewById(R.id.cbSmall);
        checkBox2 = findViewById(R.id.cbMedium);
        checkBox3 = findViewById(R.id.cbLarge);
        checkBox4 = findViewById(R.id.cbXtraLarge);
        textView2 = findViewById(R.id.tvQuantity);
        editText = findViewById(R.id.etQuantityNum);
        button = findViewById(R.id.btnAddCart);
        button2 = findViewById(R.id.fabCartDetail);


        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("textView");
        int receivedImage = intent.getIntExtra("imageView",0);

        textView.setText(receivedName);
        imageView.setImageResource(receivedImage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ce2029")));
                Toast.makeText(getApplicationContext(),"Item Added to Cart!",Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Checkout.class);
                intent.putExtra("textView",itemtype);
                intent.putExtra("imageView",itemImage);
                startActivity(intent);
            }
        });

    }
}