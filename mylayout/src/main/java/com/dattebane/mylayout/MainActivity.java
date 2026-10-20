package com.dattebane.mylayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.my_layout);
        /*Button b = new Button(this);
        b.setText("Моя кнопка");
        b.setLayoutParams(new LinearLayout.LayoutParams(dpToPx(200), dpToPx(300)));
        setContentView(b);*/

        TextView tv = findViewById(R.id.textView);
        System.out.println(tv.getText());
    }

    private int dpToPx(int dp) {
        float scale = getApplicationContext().getResources().getDisplayMetrics().density;
        return Math.round(dp * scale);
    }
}
