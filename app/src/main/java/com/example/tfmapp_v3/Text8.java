package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text8);

        // Checking if the answer to Question 8 is correct
        Button btnChk8 = (Button)findViewById(R.id.btnCheck8);
        btnChk8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr8 = (EditText) findViewById(R.id.editQ8);
                TextView textRslt8 = (TextView) findViewById(R.id.textRes8);
                TextView textPnts8 = (TextView) findViewById(R.id.PointsT8);

                // Integer check
                int Answr8 = Integer.parseInt(edAnswr8.getText().toString());

                if (Answr8 == 3) {
                    textRslt8.setText("Correct! You're doing great!");
                    int pnts8 = 1;
                    Intent getPointsFrom7 = getIntent();
                    int pointsFromT7 = getPointsFrom7.getIntExtra("pointsFrom7", 0);
                    int sumPointsT1T8 = pointsFromT7 + pnts8;
                    textPnts8.setText(sumPointsT1T8 + " point(s)");

                    // Going to Text 9
                    Button btnNext8 = (Button)findViewById(R.id.btnNextT8);
                    btnNext8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T8Intent = new Intent(Text8.this, Text9.class);
                            T8Intent.putExtra("pointsFrom8",sumPointsT1T8);
                            startActivity(T8Intent);
                        }
                    });

                } else {
                    textRslt8.setText("Almost there! Don't give up!");
                    int pnts8 = 0;
                    Intent getPointsFrom7 = getIntent();
                    int pointsFromT7 = getPointsFrom7.getIntExtra("pointsFrom7", 0);
                    int sumPointsT1T8 = pointsFromT7 + pnts8;
                    textPnts8.setText(sumPointsT1T8 + " point(s)");

                    // Going to Text 9
                    Button btnNext8 = (Button)findViewById(R.id.btnNextT8);
                    btnNext8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T8Intent = new Intent(Text8.this, Text9.class);
                            T8Intent.putExtra("pointsFrom8",sumPointsT1T8);
                            startActivity(T8Intent);
                        }
                    });

                }
            }
        });

    }
}