package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.newcalculatorapp.MainActivity;

public class Subtraction extends AppCompatActivity {

    EditText et1,et2;
    Button bt1,bt2;
    String getNum1,getNum2,result;
    int num1,num2,diff;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtraction);

        et1=(EditText) findViewById(R.id.no1);
        et2=(EditText) findViewById(R.id.no2);
        bt1=(Button) findViewById(R.id.subt);
        bt2=(Button) findViewById(R.id.bm);
        tv=(TextView)findViewById(R.id.print);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                diff=num1-num2;
                result=String.valueOf(diff);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });


    }
}