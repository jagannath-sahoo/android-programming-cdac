package in.cdac.day3infopassbetweenactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textName, textMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textMarks = findViewById(R.id.textMarks);
        textName = findViewById(R.id.textName);

        Intent intentReceive = getIntent();
        String name = intentReceive.getStringExtra("KEY_NAME");
        Float marks = intentReceive.getFloatExtra("KEY_MARKS",-1);
//        textName.setText(intentReceive.getStringExtra("KEY_NAME"));
//        textMarks.setText(intentReceive.getFloatExtra("KEY_MARKS"));
        textName.setText(name);
        textMarks.setText(marks.toString());
    }
}
