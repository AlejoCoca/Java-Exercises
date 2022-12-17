package com.example.aplicacion1alejofernandez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextoAvanzado miTexto= new TextoAvanzado();
    private MatematicaPro miMatematica= new MatematicaPro();
    private TextView label;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.label=findViewById(R.id.etiqueta);
        this.edit=findViewById(R.id.editText);
    }

    public void clickVocales(android.view.View view){
        this.miTexto.setTexto(this.edit.getText().toString());
        this.label.setText(this.miTexto.vocales());
    }

    public void clickInvertir(android.view.View view){
        this.miTexto.setTexto(this.edit.getText().toString());
        this.label.setText(this.miTexto.invertir());
    }

    public void clickSucesion(android.view.View view){
        String cadena= this.edit.getText().toString();
        int numero= Integer.parseInt(cadena);
        this.miMatematica.setNumero(numero);
        this.label.setText(this.miMatematica.sucesion());
    }
}