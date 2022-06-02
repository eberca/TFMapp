package com.example.tfmapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Text0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text0);

        Button btnNext0 = (Button)findViewById(R.id.btnNextT0);
        btnNext0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Next0Intent = new Intent(getApplicationContext(), Text1.class);
                startActivity(Next0Intent);
            }
        });
    }
}