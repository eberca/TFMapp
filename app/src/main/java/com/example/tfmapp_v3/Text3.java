package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text3);

        // Checking if the answer to Question 3 is correct
        Button btnChk3 = (Button)findViewById(R.id.btnCheck3);
        btnChk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr3 = (EditText) findViewById(R.id.editQ3);
                TextView textRslt3 = (TextView) findViewById(R.id.textRes3);
                TextView textPnts3 = (TextView) findViewById(R.id.PointsT3);

                // Integer check
                int Answr3 = Integer.parseInt(edAnswr3.getText().toString());

                if (Answr3 == 1) {
                    textRslt3.setText("Correct! You're doing great!");
                    int pnts3 = 1;
                    Intent getPointsFrom2 = getIntent();
                    int pointsFromT2 = getPointsFrom2.getIntExtra("pointsFrom2", 0);
                    int sumPointsT1T3 = pointsFromT2 + pnts3;
                    textPnts3.setText(sumPointsT1T3 + " point(s)");

                    // Going to Text 4
                    Button btnNext3 = (Button)findViewById(R.id.btnNextT3);
                    btnNext3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T3Intent = new Intent(Text3.this, Text4.class);
                            T3Intent.putExtra("pointsFrom3",sumPointsT1T3);
                            startActivity(T3Intent);
                        }
                    });

                } else {
                    textRslt3.setText("Almost there! Don't give up!");
                    int pnts3 = 0;
                    Intent getPointsFrom2 = getIntent();
                    int pointsFromT2 = getPointsFrom2.getIntExtra("pointsFrom2", 0);
                    int sumPointsT1T3 = pointsFromT2 + pnts3;
                    textPnts3.setText(sumPointsT1T3 + " point(s)");

                    // Going to Text 4
                    Button btnNext3 = (Button)findViewById(R.id.btnNextT3);
                    btnNext3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T3Intent = new Intent(Text3.this, Text4.class);
                            T3Intent.putExtra("pointsFrom3",sumPointsT1T3);
                            startActivity(T3Intent);
                        }
                    });
                }
            }
        });


    }
}