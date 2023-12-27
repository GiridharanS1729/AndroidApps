package com.example.madc1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView lin = findViewById(R.id.lin);
        ImageView gth = findViewById(R.id.gth);
        ImageView mail = findViewById(R.id.mail);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView loc = findViewById(R.id.loch);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn=findViewById(R.id.btn);



        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlToOpen = "https://www.linkedin.com/in/giridharan-s-1840a0240/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlToOpen));
                startActivity(intent);
            }
        });
        gth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlToOpen = "https://github.com/GiridharanS1729";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlToOpen));
                startActivity(intent);
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailAddress = "giridharans1729@gmail.com";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + emailAddress));
                startActivity(intent);
            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    double latitude = 12.091096;
                    double longitude = 78.424890;
                    Uri gmmIntentUri = Uri.parse("geo:" + latitude + "," + longitude + "?q=" + Uri.encode(latitude+","+longitude));
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }

        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String instagramPackage = "com.instagram.android";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    try {
                        intent.setData(Uri.parse("https://www.instagram.com/mr_unique.1729?igsh=MWMyYWdkd2Zncndieg=="));
                        intent.setPackage(instagramPackage);
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        } else {
                            // If Instagram app is not installed, open Instagram in a browser
                            intent.setData(Uri.parse("https://www.instagram.com/mr_unique.1729?igsh=MWMyYWdkd2Zncndieg=="));
                            startActivity(intent);
                        }
                    } catch (Exception e) {
                        Log.e("MainActivity", "Error opening Instagram: " + e.getMessage(), e);
                    }
                }
        });
    }
}