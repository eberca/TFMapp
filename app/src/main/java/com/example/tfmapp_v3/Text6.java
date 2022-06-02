package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text6);

        // Checking if the answer to Question 6 is correct
        Button btnChk6 = (Button)findViewById(R.id.btnCheck6);
        btnChk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr6 = (EditText) findViewById(R.id.editQ6);
                TextView textRslt6 = (TextView) findViewById(R.id.textRes6);
                TextView textPnts6 = (TextView) findViewById(R.id.PointsT6);

                // Integer check
                int Answr6 = Integer.parseInt(edAnswr6.getText().toString());

                if (Answr6 == 1) {
                    textRslt6.setText("Correct! You're doing great!");
                    int pnts6 = 1;
                    Intent getPointsFrom5 = getIntent();
                    int pointsFromT5 = getPointsFrom5.getIntExtra("pointsFrom5", 0);
                    int sumPointsT1T6 = pointsFromT5 + pnts6;
                    textPnts6.setText(sumPointsT1T6 + " point(s)");

                    // Going to Text 7
                    Button btnNext6 = (Button)findViewById(R.id.btnNextT6);
                    btnNext6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T6Intent = new Intent(Text6.this, Text7.class);
                            T6Intent.putExtra("pointsFrom6",sumPointsT1T6);
                            startActivity(T6Intent);
                        }
                    });

                } else {
                    textRslt6.setText("Almost there! Don't give up!");
                    int pnts6 = 0;
                    Intent getPointsFrom5 = getIntent();
                    int pointsFromT5 = getPointsFrom5.getIntExtra("pointsFrom5", 0);
                    int sumPointsT1T6 = pointsFromT5 + pnts6;
                    textPnts6.setText(sumPointsT1T6 + " point(s)");

                    // Going to Text 7
                    Button btnNext6 = (Button)findViewById(R.id.btnNextT6);
                    btnNext6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T6Intent = new Intent(Text6.this, Text7.class);
                            T6Intent.putExtra("pointsFrom6",sumPointsT1T6);
                            startActivity(T6Intent);
                        }
                    });
                }
            }
        });

    }
}