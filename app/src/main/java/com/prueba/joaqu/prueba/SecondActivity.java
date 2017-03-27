package com.prueba.joaqu.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent I = getIntent();
        Bundle B= I.getExtras();
        texto= (TextView) findViewById(R.id.textView2);
        if(B!=null){
            String dato= B.getString("dato");
            texto.setText(dato);
        }
    }
}
