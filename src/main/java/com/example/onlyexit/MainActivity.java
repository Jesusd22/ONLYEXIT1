package com.example.onlyexit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gvItems;
    //Button button3;

    String [] itemtype = {"beanie", "tshirt", "hoodie", "jeans", "socks"};

    int [] itemImage = {R.drawable.beanie, R.drawable.tshirt, R.drawable.hoodie, R.drawable.jeans, R.drawable.socks};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button3 = findViewById(R.id.fabCartHome);
        gvItems = findViewById(R.id.gvItems);

        MainAdapter adapter = new MainAdapter(MainActivity.this, itemtype,itemImage);
        gvItems.setAdapter(adapter);

        gvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),itemDetails.class);
                intent.putExtra("textView",itemtype[i]);
                intent.putExtra("imageView",itemImage[i]);
                startActivity(intent);
            }
        });
    }
}
