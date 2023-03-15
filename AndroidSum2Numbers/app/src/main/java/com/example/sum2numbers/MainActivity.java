package com.example.sum2numbers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Num1;
    EditText Num2;
    Button btnAdd,btnClose;
    AlertDialog.Builder builder;
    static String ADDED="Added";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = findViewById(R.id.edtNum1);
        Num2 = findViewById(R.id.edtNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnClose=findViewById(R.id.btnClose);
        builder = new AlertDialog.Builder(this);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int z = Integer.parseInt(Num1.getText().toString()) + Integer.parseInt(Num2.getText().toString());
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    String s = Integer.toString(z);
                    intent.putExtra(ADDED,s);
                    Toast.makeText(MainActivity.this, "Added successfully", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error " + e, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("Close App Alert")
                        .setMessage("Are you sure to close the app?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Selected Option: YES",Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Selected Option: No",Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog  = builder.create();
                dialog.show();
            }
        });

    }
}