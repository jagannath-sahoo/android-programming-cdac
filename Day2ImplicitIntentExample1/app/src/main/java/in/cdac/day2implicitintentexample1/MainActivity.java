package in.cdac.day2implicitintentexample1;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStartBrowser, btnStartMap, btnDialNumber, btnCallNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Runtime request permission
        on MainActivity
        Manifest Permission for making call
        101 is the request number used by android for different service
        Its similar to tokens
         */
        ActivityCompat.requestPermissions(
                MainActivity.this,
                new String[]{Manifest.permission.CALL_PHONE},
                101
        );

        btnStartBrowser =  findViewById(R.id.btnStartBrowser);
        btnStartMap = findViewById(R.id.btnStartMap);
        btnDialNumber = findViewById(R.id.btnDialNumber);
        btnCallNumber = findViewById(R.id.btnCallNumber);

        btnStartBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //URI(Uniform Resource Identifier is class
                //Helps to understand what kind of data it deals with
                Uri uri = Uri.parse("https://www.google.com");
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        uri
                );
                startActivity(intent);
            }
        });

        btnStartMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("geo:0.0,0.0");
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        uri
                );
                startActivity(intent);
            }
        });

        btnDialNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uri uri = Uri.parse(Intent.ACTION_DIAL);
                Intent intent = new Intent(
                        Intent.ACTION_DIAL
                );
                startActivity(intent);
            }
        });

        btnCallNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:" + "9439231141");
                Intent intent = new Intent(
                        Intent.ACTION_CALL,
                        uri
                );
                startActivity(intent);
            }
        });
    }
}
