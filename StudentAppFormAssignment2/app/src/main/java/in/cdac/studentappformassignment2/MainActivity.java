package in.cdac.studentappformassignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText firstName, lastName, age, qualification, address, pincode;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        age = findViewById(R.id.age);
        qualification = findViewById(R.id.qualification);
        address = findViewById(R.id.address);
        pincode = findViewById(R.id.pincode);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,
                        ViewActivity.class
                );
                intent.putExtra("KEY_FIRST_NAME",firstName.getText().toString());
                intent.putExtra("KEY_LAST_NAME",lastName.getText().toString());
                intent.putExtra("KEY_AGE",age.getText().toString());
                intent.putExtra("KEY_QUALIFICATION",qualification.getText().toString());
                intent.putExtra("KEY_ADDRESS",address.getText().toString());
                intent.putExtra("KEY_PIN_CODE", pincode.getText().toString());

                startActivity(intent);
            }
        });
    }
}
