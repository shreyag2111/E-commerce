package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Popular_products extends AppCompatActivity {

    ImageView iv1,iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_products);

        iv1=findViewById(R.id.iv1);
        iv3=findViewById(R.id.iv3);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Popular_products.this,HomeActivity.class);
                startActivity(intent);

            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Popular_products.this,Store.class);
                startActivity(intent);

            }
        });

    }
}