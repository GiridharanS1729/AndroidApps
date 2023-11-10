package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add,sub,mul,div;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        ans=findViewById(R.id.ans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,s;
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                s=a+b;
                ans.setText(String.valueOf(s));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,s;
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                s=a-b;
                ans.setText(String.valueOf(s));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,s;
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                s=a*b;
                ans.setText(String.valueOf(s));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,b,s;
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                if(a==0&&b==0){
                    ans.setText("Undefined");
                }
                else if(b==0&&a!=0){
                    ans.setText("∞");
                }
                else{
                s=a/b;
                ans.setText(String.valueOf(s));
            }}
        });

    }
}