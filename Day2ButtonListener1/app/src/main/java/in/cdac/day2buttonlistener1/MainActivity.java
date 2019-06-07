package in.cdac.day2buttonlistener1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//Create Instance of EditText and Button into the logic java file
    EditText etName;
    Button btnSubmit;
    TextView tvName;
    //onCreate() is the callback which run on execution of MainActivity class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Design of the activity is specified
        //Only one design can be shown as face activity
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editName);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvName = findViewById(R.id.textName);
        //On pressing the button this will execute
        btnSubmit.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                etName.setText("");
                tvName.setText("Name:" + name);

//                Toast.makeText(
//                        MainActivity.this,
//                        "Hello" + " " +  name + "!",
//                        Toast.LENGTH_LONG
//                ).show();
            }
        });
    }
}
