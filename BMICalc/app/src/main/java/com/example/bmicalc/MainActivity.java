package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    EditText h,w;
    Button cal;
    TextView ans,an;
    Double x,y,z,a=0.0,b,c;
    String m,n,o="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h=findViewById(R.id.h);
        w=findViewById(R.id.w);
        cal=findViewById(R.id.cal);
        ans=findViewById(R.id.an);
        an=findViewById(R.id.ans);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try {
                m = h.getText().toString();
                n = w.getText().toString();
                x = Double.valueOf(m).doubleValue();
                y = Double.valueOf(n).doubleValue();
                    if(m!="" && n!=""){
                    if (x != 0.0 && y != 0.0) {
                        x /= 100.0;
                        a = y / (x * x);
                        an.setText(String.format("%.2f", a));
                    } else {
                        an.setText(String.valueOf(a));
                    }
                    if (a < 18.0) {
                        o = "UnderWeight";
                    } else if (a > 25.0) {
                        o = "OverWeight";
                    } else if (a >= 18.0 && a <= 25.0) {
                        o = "Normal";
                    } else {
                        o = "Error:";
                    }
                    ans.setText(o);
                }
                }
                catch (Exception e) {
                    ans.setText("Enter Height and Weight.");
                }
            }
        });
    }
}