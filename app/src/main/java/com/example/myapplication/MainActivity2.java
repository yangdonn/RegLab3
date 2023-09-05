package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String stdid = intent.getStringExtra("stdid");
        String name = intent.getStringExtra("name");
        String acd = intent.getStringExtra("acd");
        String dept = intent.getStringExtra("program");
        String year = intent.getStringExtra("yr");
        String sem = intent.getStringExtra("sem");
        String displayingmod = intent.getStringExtra("mod");


        TextView idn = findViewById(R.id.idn);
        idn.setText(stdid);

        TextView displayingname = findViewById(R.id.displayingname);
        displayingname.setText(name);

        TextView dyr = findViewById(R.id.dyr);
        dyr.setText(acd);

        TextView ss = findViewById(R.id.ss);
        ss.setText(sem);

        TextView dyearr = findViewById(R.id.dyearr);
        dyearr.setText(year);

        TextView displayingPg = findViewById(R.id.displayingpg);
        displayingPg.setText(dept);


        TextView displayingMod = findViewById(R.id.displayingMod);
        displayingMod.setText(displayingmod);

        Button exitButton = findViewById(R.id.exit);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}


