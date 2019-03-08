package com.example.phonedialer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.SyncStateContract;
import android.provider.SyncStateContract.Constants;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText textWindow = findViewById(R.id.phone_number_edit_text);
        findViewById(R.id.star_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("*");
            }
        });

        findViewById(R.id.pound_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("#");
            }
        });


        findViewById(R.id.number_1_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("1");
            }
        });

        findViewById(R.id.number_2_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("2");
            }
        });


        findViewById(R.id.number_3_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("3");
            }
        });

        findViewById(R.id.number_4_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("4");
            }
        });


        findViewById(R.id.number_5_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("5");
            }
        });

        findViewById(R.id.number_6_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("6");
            }
        });

        findViewById(R.id.number_7_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("7");
            }
        });


        findViewById(R.id.number_8_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("8");
            }
        });


        findViewById(R.id.number_9_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("9");
            }
        });

        findViewById(R.id.number_0_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWindow.append("0");
            }
        });

        findViewById(R.id.backspace_image_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = textWindow.getText().toString();
                if (phoneNumber.length() > 0) {
                    phoneNumber = phoneNumber.substring(0, phoneNumber.length() - 1);
                    textWindow.setText(phoneNumber);
                }
            }
        });


        findViewById(R.id.call_image_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(
                            MainActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            1);
                } else {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + textWindow.getText().toString()));
                    startActivity(intent);
                }

            }
        });

        findViewById(R.id.hangup_image_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }1
        });

     }
}
