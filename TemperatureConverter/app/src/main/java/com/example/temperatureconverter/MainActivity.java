package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    EditText txtF;
    Button F2C;
    TextView txtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        F2C = findViewById(R.id.F2C);
        txtC = findViewById(R.id.txtC);

        F2C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahrenheit = txtF.getText().toString();
                try {
                    double f = Double.parseDouble(fahrenheit);
                    double c = (f - 32.0) * (5.0/9.0);
                    String output = Double.toString(c) + " ℃";
                    txtC.setText(output);
                } catch (Exception e) {
                    txtC.setText("-℃");
                }
            }
        });
    }
}
