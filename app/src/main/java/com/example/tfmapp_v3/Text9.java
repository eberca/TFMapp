package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text9);

        // Checking if the answer to Question 9 is correct
        Button btnChk9 = (Button)findViewById(R.id.btnCheck9);
        btnChk9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr9 = (EditText) findViewById(R.id.editQ9);
                TextView textRslt9 = (TextView) findViewById(R.id.textRes9);
                TextView textPnts9 = (TextView) findViewById(R.id.PointsT9);

                // Integer check
                int Answr9 = Integer.parseInt(edAnswr9.getText().toString());

                if (Answr9 == 1) {
                    textRslt9.setText("Correct! You're doing great!");
                    int pnts9 = 1;
                    Intent getPointsFrom8 = getIntent();
                    int pointsFromT8 = getPointsFrom8.getIntExtra("pointsFrom8", 0);
                    int sumPointsT1T9 = pointsFromT8 + pnts9;
                    textPnts9.setText(sumPointsT1T9 + " point(s)");

                    // Going to Text 10
                    Button btnNext9 = (Button)findViewById(R.id.btnNextT9);
                    btnNext9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T9Intent = new Intent(Text9.this, Text10.class);
                            T9Intent.putExtra("pointsFrom9",sumPointsT1T9);
                            startActivity(T9Intent);
                        }
                    });

                } else {
                    textRslt9.setText("Almost there! Don't give up!");
                    int pnts9 = 0;
                    Intent getPointsFrom8 = getIntent();
                    int pointsFromT8 = getPointsFrom8.getIntExtra("pointsFrom8", 0);
                    int sumPointsT1T9 = pointsFromT8 + pnts9;
                    textPnts9.setText(sumPointsT1T9 + " point(s)");

                    // Going to Text 10
                    Button btnNext9 = (Button)findViewById(R.id.btnNextT9);
                    btnNext9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T9Intent = new Intent(Text9.this, Text10.class);
                            T9Intent.putExtra("pointsFrom9",sumPointsT1T9);
                            startActivity(T9Intent);
                        }
                    });

                }
            }
        });

    }
}