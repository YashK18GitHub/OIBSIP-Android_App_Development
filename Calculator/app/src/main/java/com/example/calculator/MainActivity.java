package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns); // Initialize tvAns with the corresponding TextView

        add = findViewById(R.id.addButton);
        subtract = findViewById(R.id.subtractButton);
        multiply = findViewById(R.id.multiplyButton);
        divide = findViewById(R.id.divideButton);

        // for addition
        add.setOnClickListener((v) -> {
            int firstValue, secondValue, ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());

            ans = firstValue + secondValue;
            tvAns.setText("Ans is " + ans);
        });

        // for Subtraction
        subtract.setOnClickListener((v) -> {
            int firstValue, secondValue, ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());

            ans = firstValue - secondValue;
            tvAns.setText("Ans is " + ans);
        });

        // for multiplication
        multiply.setOnClickListener((v) -> {
            int firstValue, secondValue, ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());

            ans = firstValue * secondValue;
            tvAns.setText("Ans is " + ans);
        });

        // for division
        divide.setOnClickListener((v) -> {
            int firstValue, secondValue, ans;

            firstValue = Integer.parseInt(etFirstValue.getText().toString());
            secondValue = Integer.parseInt(etSecondValue.getText().toString());

            if (secondValue == 0) {
                tvAns.setText("Cannot divide by zero");
            } else {
                ans = firstValue / secondValue;
                tvAns.setText("Ans is " + ans);
            }
        });
    }
}
