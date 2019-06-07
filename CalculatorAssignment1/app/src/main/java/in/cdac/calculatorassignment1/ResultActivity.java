package in.cdac.calculatorassignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textResult = findViewById(R.id.textResult);

        Intent receivedIntent = getIntent();
        Float result = receivedIntent.getFloatExtra("KEY_RESULTS",-1);
        textResult.setText(result.toString());
    }
}
