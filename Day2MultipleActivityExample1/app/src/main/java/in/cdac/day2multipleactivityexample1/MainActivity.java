package in.cdac.day2multipleactivityexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart2ndActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart2ndActivity = findViewById(R.id.btnStart2ndActivity);
        btnStart2ndActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,//Current activity class
                        SecondActivity.class//Target activity class, Android system will find this
                        //bring into the front
                );
                startActivity(intent);//To start a activity
            }
        });
    }
}
