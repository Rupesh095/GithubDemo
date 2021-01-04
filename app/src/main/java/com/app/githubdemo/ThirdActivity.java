package com.app.githubdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        /*-- Comment First --*/

        /*-- Comment Second --*/

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button = findViewById(R.id.button);

        /*-- Comment Four --*/

        /*-- Comment Five --*/

        /*-- Comment Six --*/

    }
}