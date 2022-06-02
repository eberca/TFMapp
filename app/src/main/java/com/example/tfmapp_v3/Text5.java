package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text5);

        // Checking if the answer to Question 5 is correct
        Button btnChk5 = (Button)findViewById(R.id.btnCheck5);
        btnChk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr5 = (EditText) findViewById(R.id.editQ5);
                TextView textRslt5 = (TextView) findViewById(R.id.textRes5);
                TextView textPnts5 = (TextView) findViewById(R.id.PointsT5);

                // Integer check
                int Answr5 = Integer.parseInt(edAnswr5.getText().toString());

                if (Answr5 == 2) {
                    textRslt5.setText("Correct! You're doing great!");
                    int pnts5 = 1;
                    Intent getPointsFrom4 = getIntent();
                    int pointsFromT4 = getPointsFrom4.getIntExtra("pointsFrom4", 0);
                    int sumPointsT1T5 = pointsFromT4 + pnts5;
                    textPnts5.setText(sumPointsT1T5 + " point(s)");

                    // Going to Text 6
                    Button btnNext5 = (Button)findViewById(R.id.btnNextT5);
                    btnNext5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T5Intent = new Intent(Text5.this, Text6.class);
                            T5Intent.putExtra("pointsFrom5",sumPointsT1T5);
                            startActivity(T5Intent);
                        }
                    });

                } else {
                    textRslt5.setText("Almost there! Don't give up!");
                    int pnts5 = 0;
                    Intent getPointsFrom4 = getIntent();
                    int pointsFromT4 = getPointsFrom4.getIntExtra("pointsFrom4", 0);
                    int sumPointsT1T5 = pointsFromT4 + pnts5;
                    textPnts5.setText(sumPointsT1T5 + " point(s)");

                    // Going to Text 6
                    Button btnNext5 = (Button)findViewById(R.id.btnNextT5);
                    btnNext5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T5Intent = new Intent(Text5.this, Text6.class);
                            T5Intent.putExtra("pointsFrom5",sumPointsT1T5);
                            startActivity(T5Intent);
                        }
                    });
                }
            }
        });

    }
}