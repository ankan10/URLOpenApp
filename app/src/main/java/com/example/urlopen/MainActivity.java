package com.example.urlopen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.txt3);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                implicit
                String url= editText.getText().toString();
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                //explicit
   //Intent intent= new Intent(MainActivity.this, SecondActivity.class);

//                startActivity(intent);
                //passing to new screen
//                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
//                intent.putExtra("Value to share", "Android Content");
//                intent.putExtra("Value to show", "Value is fetched");
//                startActivity(intent);
            }
        });
    }
}
