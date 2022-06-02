package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text10);

        // Checking if the answer to Question 10 is correct
        Button btnChk10 = (Button)findViewById(R.id.btnCheck10);
        btnChk10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr10 = (EditText) findViewById(R.id.editQ10);
                TextView textRslt10 = (TextView) findViewById(R.id.textRes10);
                TextView textPnts10 = (TextView) findViewById(R.id.PointsT10);

                // Integer check
                int Answr10 = Integer.parseInt(edAnswr10.getText().toString());

                if (Answr10 == 2) {
                    textRslt10.setText("Correct! You're doing great!");
                    int pnts10 = 1;
                    Intent getPointsFrom9 = getIntent();
                    int pointsFromT9 = getPointsFrom9.getIntExtra("pointsFrom9", 0);
                    int sumPointsT1T10 = pointsFromT9 + pnts10;
                    textPnts10.setText(sumPointsT1T10 + " point(s)");

                        if (sumPointsT1T10 > 7) {
                            // Going to Final A
                            Button btnNext10 = (Button)findViewById(R.id.btnNextT10);
                            btnNext10.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent T10Intent = new Intent(Text10.this, FinalA.class);
                                    T10Intent.putExtra("pointsFrom10",sumPointsT1T10);
                                    startActivity(T10Intent);
                                }
                            });

                        } else {
                            // Going to Final B
                            Button btnNext10 = (Button)findViewById(R.id.btnNextT10);
                            btnNext10.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent T10Intent = new Intent(Text10.this, FinalB.class);
                                    T10Intent.putExtra("pointsFrom10",sumPointsT1T10);
                                    startActivity(T10Intent);
                                }
                            });
                        }

                } else {
                    textRslt10.setText("Almost there! Don't give up!");
                    int pnts10 = 0;
                    Intent getPointsFrom9 = getIntent();
                    int pointsFromT9 = getPointsFrom9.getIntExtra("pointsFrom9", 0);
                    int sumPointsT1T10 = pointsFromT9 + pnts10;
                    textPnts10.setText(sumPointsT1T10 + " point(s)");

                    if (sumPointsT1T10 > 7) {
                        // Going to Final A
                        Button btnNext10 = (Button)findViewById(R.id.btnNextT10);
                        btnNext10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent T10Intent = new Intent(Text10.this, FinalA.class);
                                T10Intent.putExtra("pointsFrom10",sumPointsT1T10);
                                startActivity(T10Intent);
                            }
                        });
                    } else {
                        // Going to Final B
                        Button btnNext10 = (Button)findViewById(R.id.btnNextT10);
                        btnNext10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent T10Intent = new Intent(Text10.this, FinalB.class);
                                T10Intent.putExtra("pointsFrom10",sumPointsT1T10);
                                startActivity(T10Intent);
                            }
                        });
                    }

                }
            }
        });

    }
}