package in.cdac.day3infopassbetweenactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnStart2ndAct;
    EditText editMarks,editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart2ndAct = findViewById(R.id.btnStart2ndAct);
        editMarks = findViewById(R.id.editMarks);
        editName = findViewById(R.id.editName);

        btnStart2ndAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String marks = editMarks.getText().toString();
//                if(name.length() == 0)
//                {
//                    Toast.makeText(
//                            MainActivity.this,
//                            "Nothing to send",
//                            Toast.LENGTH_LONG
//                    );
//                }

                float floatMarks = Float.parseFloat(marks);
                //float mark = Float.parseFloat(editMarks.getText().toString());
                //Send Information with intent and then receive the data from intent in
                //Second activity
                //Before firing of intent attach information with it so that it will be carried
                //with it
                Intent intent = new Intent(
                        MainActivity.this, SecondActivity.class
                );
                //If you have the key then only in the second activity we can extract the
                // information
                intent.putExtra("KEY_NAME",name);
                intent.putExtra("KEY_MARKS",floatMarks);
                startActivity(intent);
            }
        });
    }
}
