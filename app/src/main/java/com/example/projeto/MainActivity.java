package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditTextText;
    private  EditText EditTextText2;

    private EditText EditTextText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditTextText = findViewById(R.id.editTextText);
        EditTextText2 = findViewById(R.id.editTextText2);
        EditTextText3 = findViewById(R.id.editTextText3);

    }
    public void click(View view){
        int x, y, soma;
        x = Integer.parseInt(EditTextText.getText().toString());
        y = Integer.parseInt(EditTextText2.getText().toString());
        soma = x + y;
        EditTextText3.setText(Integer.toString(soma));
        

    }

}