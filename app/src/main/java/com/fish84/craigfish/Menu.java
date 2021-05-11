package com.fish84.craigfish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private String Visitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // captures visitors name from the main activity and displays it in the visitorName textview
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Visitor = extras.getString( "visitorWelcome");
            TextView UserWelcome = (TextView) findViewById(R.id.visitorName);
            UserWelcome.setText(  "Dear " + Visitor );
        }

        Button btn = findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.btnAbout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, AboutMe.class);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.btnCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Calculation.class);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.btnProfile);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MyProfile.class);
                startActivity(intent);
            }
        });
    }
}