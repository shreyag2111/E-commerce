package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sale extends AppCompatActivity {

    ImageView iv2,iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);

        iv2=findViewById(R.id.iv2);
        iv4=findViewById(R.id.iv4);

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sale.this,HomeActivity.class);
                startActivity(intent);

            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sale.this,Store.class);
                startActivity(intent);

            }
        });

    }
}