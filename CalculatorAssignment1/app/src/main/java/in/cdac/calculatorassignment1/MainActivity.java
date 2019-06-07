package in.cdac.calculatorassignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button btnPlus, btnMinus, btnMultiply, btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //(Float.parseFloat(input1.getText().toString() + Float.parseFloat(input2.getText().toString())))
                Float num1 = Float.parseFloat(input1.getText().toString());
                Float num2 = Float.parseFloat(input2.getText().toString());
                Float result = num1 + num2;
                //String strResult = result.toString();
                Toast.makeText(
                        MainActivity.this,
                        result.toString(),
                        Toast.LENGTH_LONG
                ).show();

                Intent intent = new Intent(
                        MainActivity.this,
                        ResultActivity.class
                );
                intent.putExtra("KEY_RESULTS",result);
                startActivity(intent);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //(Float.parseFloat(input1.getText().toString() + Float.parseFloat(input2.getText().toString())))
                Float num1 = Float.parseFloat(input1.getText().toString());
                Float num2 = Float.parseFloat(input2.getText().toString());
                Float result = num1 - num2;
                //String strResult = result.toString();
                Toast.makeText(
                        MainActivity.this,
                        result.toString(),
                        Toast.LENGTH_LONG
                ).show();
                Intent intent = new Intent(
                        MainActivity.this,
                        ResultActivity.class
                );
                intent.putExtra("KEY_RESULTS",result);
                startActivity(intent);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //(Float.parseFloat(input1.getText().toString() + Float.parseFloat(input2.getText().toString())))
                Float num1 = Float.parseFloat(input1.getText().toString());
                Float num2 = Float.parseFloat(input2.getText().toString());
                Float result = num1 * num2;
                //String strResult = result.toString();
                Toast.makeText(
                        MainActivity.this,
                        result.toString(),
                        Toast.LENGTH_LONG
                ).show();
                Intent intent = new Intent(
                        MainActivity.this,
                        ResultActivity.class
                );
                intent.putExtra("KEY_RESULTS",result);
                startActivity(intent);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //(Float.parseFloat(input1.getText().toString() + Float.parseFloat(input2.getText().toString())))
                Float num1 = Float.parseFloat(input1.getText().toString());
                Float num2 = Float.parseFloat(input2.getText().toString());
                Float result = num1 / num2;
                //String strResult = result.toString();
                Toast.makeText(
                        MainActivity.this,
                        result.toString(),
                        Toast.LENGTH_LONG
                ).show();
                Intent intent = new Intent(
                        MainActivity.this,
                        ResultActivity.class
                );
                intent.putExtra("KEY_RESULTS",result);
                startActivity(intent);
            }
        });
    }
}
