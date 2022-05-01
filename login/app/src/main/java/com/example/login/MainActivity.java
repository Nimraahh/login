package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button12 = (Button) findViewById(R.id.button12);
        TextView text10= (TextView) findViewById(R.id.text10);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text10.setText("Login Successful");
            }
        });
    }
}