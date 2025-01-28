package org.Calculadora;

//Clase 4: Cociente. Realizada por Alberto Balaguer Gómez.

public class Division {

    private double real1, real2;
    private int num3, num4;
    private double num5;

    //Constructor con campos seleccionados:

    public Division(double real1, double real2, int num3, int num4, double num5) {
        super();
        this.real1 = real1;
        this.real2 = real2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    //Constructor con campos vacíos:

    public Division() {
        super();
    }

    //Getters y Setters:

    public double getReal1() {
        return real1;
    }

    public void setReal1(double real1) {
        this.real1 = real1;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

    //toString:

    @Override
    public String toString() {
        return "Division [real1=" + real1 + ", real2=" + real2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5
                + "]";
    }


    //MÉTODOS PROPIOS:

    //METODO DE DIVISIÓN DE REALES:

    public double cocienteReales(double num1,double num2){
        return num1/num2;
    }


    //METODO DE DIVISION DE ENTEROS:
    public double cocienteEnteros(int num3,int num4){
        return num3/num4;
    }

    //METODO DE nºINVERSO:
    public double numeroInverso(double num5){
        return 1/num5;
    }


}
