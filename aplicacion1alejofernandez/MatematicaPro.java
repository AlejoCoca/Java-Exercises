package com.example.aplicacion1alejofernandez;

public class MatematicaPro {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String sucesion(){
        String respuesta="";
        for(int i=1;i<=this.numero;i++){
            respuesta+=String.valueOf(i)+" ";
        }
        return respuesta;
    }
}
