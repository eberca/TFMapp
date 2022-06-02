package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Text1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text1);

        // Checking if the answer to Question 1 is correct
        Button btnChk1 = (Button)findViewById(R.id.btnCheck1);
        btnChk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edAnswr1 = (EditText) findViewById(R.id.editQ1);
                TextView textRslt1 = (TextView) findViewById(R.id.textRes1);
                TextView textPnts1 = (TextView) findViewById(R.id.PointsT1);

                // Integer check
                int Answr1 = Integer.parseInt(edAnswr1.getText().toString());

                if (Answr1 == 3) {
                    textRslt1.setText("Correct! You're doing great!");
                    int pnts1 = 1;
                    textPnts1.setText(pnts1 + " point(s)");

                    // Going to Text 2
                    Button btnNext1 = (Button)findViewById(R.id.btnNextT1);
                    btnNext1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T1Intent = new Intent(Text1.this, Text2.class);
                            T1Intent.putExtra("pointsFrom1",pnts1);
                            startActivity(T1Intent);
                        }
                    });


                } else {
                    textRslt1.setText("Almost there! Don't give up!");
                    int pnts1 = 0;
                    textPnts1.setText(pnts1 + " point(s)");

                    // Going to Text 2
                    Button btnNext1 = (Button)findViewById(R.id.btnNextT1);
                    btnNext1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent T1Intent = new Intent(Text1.this, Text2.class);
                            T1Intent.putExtra("pointsFrom1",pnts1);
                            startActivity(T1Intent);
                        }
                    });


                }
            }
        });



    }
}