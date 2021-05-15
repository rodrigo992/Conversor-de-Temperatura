package com.example.conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText et_tempC;
    Button bt_converter;
    TextView tv_tempF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_tempC = findViewById(R.id.et_tempC);
        bt_converter = findViewById(R.id.bt_converter);
        tv_tempF = findViewById(R.id.tv_resultado);

        bt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tempC = Double.parseDouble(et_tempC.getText().toString());

                DecimalFormat arredondar = new DecimalFormat( "#.##");
                double tempF = Double.parseDouble(arredondar.format( tempC * 1.8 + 32));
                tv_tempF.setText(String.valueOf(tempF));
            }
        });
    }
}