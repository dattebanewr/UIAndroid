package com.dattebane.myuserinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        Intent intent = getIntent();
        String number1 = intent.getStringExtra("NUMBER_1");
        String number2 = intent.getStringExtra("NUMBER_2");
        double result = Double.parseDouble(number1) + Double.parseDouble(number2);

        // Целый результат показываем без ".0": 5 вместо 5.0
        String resultText;
        if (result == (long) result) {
            resultText = String.valueOf((long) result);
        } else {
            resultText = String.valueOf(result);
        }

        TextView summa = findViewById(R.id.summa);
        summa.setText(number1 + " + " + number2 + " = " + resultText);
    }

    public void clickButton(View view) {
        // Просто закрываем экран, и пользователь возвращается на предыдущий
        finish();
    }

}
