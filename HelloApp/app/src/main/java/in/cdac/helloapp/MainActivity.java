package in.cdac.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button bt1;
    //Created when this app is initialized
    //it will create the resource
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Provide reference of the same button created in xml
        bt1 = findViewById(R.id.btnSubmit);

        //On button click This method will be executed
        //View.OnClickListener class is called inner anonymous class
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,//Defining the activity
                        "Button Clicked",//Text to show
                        Toast.LENGTH_LONG//Duration for Toast
                ).show();

            }
        });//End of onCreate()
    }
}
