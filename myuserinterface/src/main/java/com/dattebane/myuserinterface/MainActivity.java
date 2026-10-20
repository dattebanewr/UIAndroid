package com.dattebane.myuserinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText et1 = findViewById(R.id.number1);
        EditText et2 = findViewById(R.id.number2);
        String number1 = et1.getText().toString().trim();
        String number2 = et2.getText().toString().trim();

        // Проверяем, что в обоих полях введены числа
        if (!isNumber(number1) || !isNumber(number2)) {
            Toast.makeText(this, R.string.error_numbers, Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, BackActivity.class);
        intent.putExtra("NUMBER_1", number1);
        intent.putExtra("NUMBER_2", number2);
        startActivity(intent);
    }

    private boolean isNumber(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
