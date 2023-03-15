package com.example.sum2numbers;

import static android.text.TextUtils.concat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.example.sum2numbers.R;
public class MainActivity2 extends AppCompatActivity {
    TextView txtValue;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtValue=findViewById(R.id.txtValue);
        Intent intent=getIntent();
        String s1= intent.getStringExtra("Added");
        String s2 = getResources().getString(R.string.sum);
        txtValue.setText(s2+" = "+s1);
//        txtValue.setText("Sum = "+s1);
//        txtValue.setText(R.string.add);
//        txtValue.setText(concat(Integer.toString(R.string.add),s1));
//        txtValue.setText(R.string.add);
//        txtValue.setText(context.getString(R.string.add) + s1);

//        txtValue.setText(getIntent().getStringExtra(ADDED));
//        Bundle b = intent.getExtras();
//        if(b!=null)
//        {
//            try {
//                String j =(String) b.get(ADDED);
//                txtValue.setText(j);
//            }catch (Exception e){
//                Toast.makeText(this, "E"+e, Toast.LENGTH_SHORT).show();
//            }
//        }
    }
}