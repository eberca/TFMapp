package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        Button btnNextInstructions = (Button)findViewById(R.id.btnNextIns);
        btnNextInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InstructionsIntent = new Intent(getApplicationContext(), Text1.class);
                startActivity(InstructionsIntent);
            }
        });
    }
}