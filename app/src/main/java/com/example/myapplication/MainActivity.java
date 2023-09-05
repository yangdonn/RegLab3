package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.programs);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.programmes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        move=findViewById(R.id.submit);
        move.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                String stdId = ((EditText) findViewById(R.id.std)).getText().toString();
                String name = ((EditText) findViewById(R.id.programmes)).getText().toString();
                String program = ((Spinner) findViewById(R.id.programs)).getSelectedItem().toString();
                String acdYear = ((EditText) findViewById(R.id.academicyr)).getText().toString();
                String year = ((EditText) findViewById(R.id.yr)).getText().toString();
                String semester = ((EditText) findViewById(R.id.sem)).getText().toString();
                String modules = ((EditText) findViewById(R.id.mods)).getText().toString();

                intent.putExtra("stdid", stdId);
                intent.putExtra("name", name);
                intent.putExtra("program", program);
                intent.putExtra("acd", acdYear);
                intent.putExtra("yr", year);
                intent.putExtra("sem", semester);
                intent.putExtra("mod", modules);

                startActivity(intent);
            }
        });
    }
}


