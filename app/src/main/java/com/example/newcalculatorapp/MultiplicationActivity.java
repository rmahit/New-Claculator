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

public class MultiplicationActivity extends AppCompatActivity {

    EditText et5,et6;
    Button bu5,bu6;
    String getNum1,getNum2,result;
    int num1,num2,product;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);

        et5=(EditText) findViewById(R.id.n1);
        et6=(EditText) findViewById(R.id.n2);
        bu5=(Button) findViewById(R.id.mulo);
        bu6=(Button) findViewById(R.id.bckmenu);
        tv=(TextView)findViewById(R.id.ppp);

        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et5.getText().toString();
                getNum2=et6.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                product=num1*num2;
                result=String.valueOf(product);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob6=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob6);
            }
        });
    }
}