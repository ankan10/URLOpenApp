package com.example.urlopen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setContentView(R.layout.activity_second);

        Bundle extras= getIntent().getExtras();
        String value1= extras.getString("Value to share");
        String value2= extras.getString("Value to show");
        Toast.makeText(SecondActivity.this, "Values are:\n First value:"+ value1+ "\n Second Value:"+ value2, Toast.LENGTH_LONG).show();

    }
}
