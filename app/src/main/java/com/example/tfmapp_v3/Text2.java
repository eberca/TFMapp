package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2);

        // Checking if the answer to Question 1 is correct
        Button btnChk2 = (Button)findViewById(R.id.btnCheck2);
        btnChk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr2 = (EditText) findViewById(R.id.editQ2);
                TextView textRslt2 = (TextView) findViewById(R.id.textRes2);
                TextView textPnts2 = (TextView) findViewById(R.id.PointsT2);

                // Integer check
                int Answr2 = Integer.parseInt(edAnswr2.getText().toString());

                if (Answr2 == 2) {
                    textRslt2.setText("Correct! You're doing great!");
                    int pnts2 = 1;
                    Intent getPointsFrom1 = getIntent();
                    int pointsFromT1 = getPointsFrom1.getIntExtra("pointsFrom1", 0);
                    int sumPointsT1T2 = pointsFromT1 + pnts2;
                    textPnts2.setText(sumPointsT1T2 + " point(s)");

                    // Going to Text 3
                    Button btnNext2 = (Button)findViewById(R.id.btnNextT2);
                    btnNext2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T2Intent = new Intent(Text2.this, Text3.class);
                            T2Intent.putExtra("pointsFrom2",sumPointsT1T2);
                            startActivity(T2Intent);
                        }
                    });


                } else {
                    textRslt2.setText("Almost there! Don't give up!");
                    int pnts2 = 0;
                    Intent getPointsFrom1 = getIntent();
                    int pointsFromT1 = getPointsFrom1.getIntExtra("pointsFrom1", 0);
                    int sumPointsT1T2 = pointsFromT1 + pnts2;
                    textPnts2.setText(sumPointsT1T2 + " point(s)");

                    // Going to Text 3
                    Button btnNext2 = (Button)findViewById(R.id.btnNextT2);
                    btnNext2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T2Intent = new Intent(Text2.this, Text3.class);
                            T2Intent.putExtra("pointsFrom2",sumPointsT1T2);
                            startActivity(T2Intent);
                        }
                    });

                }
            }
        });

    }
}