package com.example.ejemplo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);

    }
    public void dividir(View view){
        try{
            //código
            String valor1_String = et1.getText().toString();
            String valor2_String = et2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);
            int dividir = valor1_int / valor2_int;
            String resultado = String.valueOf(dividir);
            tv1.setText(resultado);
        }catch (Exception a){
              //comportamiento del error
            String error = " Error!!!!!" + a;
            Toast.makeText(this, error, Toast.LENGTH_SHORT).show();


        } finally{
            Toast.makeText(this, "Se ha concluido la Operación!!", Toast.LENGTH_SHORT).show();
        }


    }
}