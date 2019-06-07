package in.cdac.studentappformassignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView firstName, lastName, age, qualification, address, pincode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        firstName = findViewById(R.id.fName);
        lastName = findViewById(R.id.lName);
        age = findViewById(R.id.ageView);
        qualification = findViewById(R.id.qauli);
        address = findViewById(R.id.addr);
        pincode = findViewById(R.id.pin);

        Intent intent = getIntent();
        firstName.setText(intent.getStringExtra("KEY_FIRST_NAME"));
        lastName.setText(intent.getStringExtra("KEY_LAST_NAME"));
        age.setText(intent.getStringExtra("KEY_AGE"));
        qualification.setText(intent.getStringExtra("KEY_QUALIFICATION"));
        address.setText(intent.getStringExtra("KEY_ADDRESS"));
        pincode.setText(intent.getStringExtra("KEY_PIN_CODE"));
    }
}
