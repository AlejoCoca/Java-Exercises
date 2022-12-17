package com.example.aplicacion1alejofernandez;

public class TextoAvanzado {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String invertir(){
        String resultado="";
        for (int i=this.texto.length()-1;i>=0;i--){
            resultado+=this.texto.charAt(i);
        }
        return resultado;
    }

    public String vocales(){
        String resultado="";
        String vocales="aeiouAEIOU";
        for (int i=0;i<this.texto.length();i++){
            String letra = String.copyValueOf(new char[]{this.texto.charAt(i)});
            if (vocales.contains(letra))
                resultado+=letra;
        }
        return resultado;
    }

}
