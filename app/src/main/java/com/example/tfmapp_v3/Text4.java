package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text4);

        // Checking if the answer to Question 4 is correct
        Button btnChk4 = (Button)findViewById(R.id.btnCheck4);
        btnChk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr4 = (EditText) findViewById(R.id.editQ4);
                TextView textRslt4 = (TextView) findViewById(R.id.textRes4);
                TextView textPnts4 = (TextView) findViewById(R.id.PointsT4);

                // Integer check
                int Answr4 = Integer.parseInt(edAnswr4.getText().toString());

                if (Answr4 == 3) {
                    textRslt4.setText("Correct! You're doing great!");
                    int pnts4 = 1;
                    Intent getPointsFrom3 = getIntent();
                    int pointsFromT3 = getPointsFrom3.getIntExtra("pointsFrom3", 0);
                    int sumPointsT1T4 = pointsFromT3 + pnts4;
                    textPnts4.setText(sumPointsT1T4 + " point(s)");

                    // Going to Text 5
                    Button btnNext4 = (Button)findViewById(R.id.btnNextT4);
                    btnNext4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T4Intent = new Intent(Text4.this, Text5.class);
                            T4Intent.putExtra("pointsFrom4",sumPointsT1T4);
                            startActivity(T4Intent);
                        }
                    });

                } else {
                    textRslt4.setText("Almost there! Don't give up!");
                    int pnts4 = 0;
                    Intent getPointsFrom3 = getIntent();
                    int pointsFromT3 = getPointsFrom3.getIntExtra("pointsFrom3", 0);
                    int sumPointsT1T4 = pointsFromT3 + pnts4;
                    textPnts4.setText(sumPointsT1T4 + " point(s)");

                    // Going to Text 5
                    Button btnNext4 = (Button)findViewById(R.id.btnNextT4);
                    btnNext4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T4Intent = new Intent(Text4.this, Text5.class);
                            T4Intent.putExtra("pointsFrom4",sumPointsT1T4);
                            startActivity(T4Intent);
                        }
                    });


                }
            }
        });

    }
}