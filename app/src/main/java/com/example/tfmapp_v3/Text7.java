package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text7);

        // Checking if the answer to Question 7 is correct
        Button btnChk7 = (Button)findViewById(R.id.btnCheck7);
        btnChk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr7 = (EditText) findViewById(R.id.editQ7);
                TextView textRslt7 = (TextView) findViewById(R.id.textRes7);
                TextView textPnts7 = (TextView) findViewById(R.id.PointsT7);

                // Integer check
                int Answr7 = Integer.parseInt(edAnswr7.getText().toString());

                if (Answr7 == 2) {
                    textRslt7.setText("Correct! You're doing great!");
                    int pnts7 = 1;
                    Intent getPointsFrom6 = getIntent();
                    int pointsFromT6 = getPointsFrom6.getIntExtra("pointsFrom6", 0);
                    int sumPointsT1T7 = pointsFromT6 + pnts7;
                    textPnts7.setText(sumPointsT1T7 + " point(s)");

                    // Going to Text 8
                    Button btnNext7 = (Button)findViewById(R.id.btnNextT7);
                    btnNext7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T7Intent = new Intent(Text7.this, Text8.class);
                            T7Intent.putExtra("pointsFrom7",sumPointsT1T7);
                            startActivity(T7Intent);
                        }
                    });

                } else {
                    textRslt7.setText("Almost there! Don't give up!");
                    int pnts7 = 0;
                    Intent getPointsFrom6 = getIntent();
                    int pointsFromT6 = getPointsFrom6.getIntExtra("pointsFrom6", 0);
                    int sumPointsT1T7 = pointsFromT6 + pnts7;
                    textPnts7.setText(sumPointsT1T7 + " point(s)");

                    // Going to Text 8
                    Button btnNext7 = (Button)findViewById(R.id.btnNextT7);
                    btnNext7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T7Intent = new Intent(Text7.this, Text8.class);
                            T7Intent.putExtra("pointsFrom7",sumPointsT1T7);
                            startActivity(T7Intent);
                        }
                    });

                }
            }
        });

    }
}