package com.prueba.joaqu.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edit;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.editText);
        boton = (Button) findViewById(R.id.buttom);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttom:
                String dato= edit.getText().toString();
                //texto.setText(dato);
                Intent I=new Intent(MainActivity.this,SecondActivity.class);
                I.putExtra("dato",dato);
                startActivity(I);
                break;
        }

    }
}
