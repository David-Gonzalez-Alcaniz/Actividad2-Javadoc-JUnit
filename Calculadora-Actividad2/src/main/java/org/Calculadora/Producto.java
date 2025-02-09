package org.Calculadora;

//CLASE CREADA POR DAVID GONZÁLEZ ALCAÑIZ.

public class Producto {

    //DATOS
    private double multiplo1, multiplo2, multiplo5;
    private int multiplo3, multiplo4;

    //MÉTODOS PROPIOS
    //Producto 2 números reales.
    public static double producto2Reales (double multiplo1, double multiplo2){
        return multiplo1 * multiplo2;
    }

    //Producto 2 números enteros.
    public static int productoEnteros (int multiplo3, int multiplo4){
        return multiplo3 * multiplo4;
    }

    //Producto 3 números reales.
    public static double producto3Reales (double multiplo1, double multiplo2, double multiplo5) {
        return multiplo1 * multiplo2 * multiplo5;
    }

    //Generar constructor.
    public Producto() {
    }

    public Producto(int multiplo4, double multiplo1, double multiplo2, double multiplo5, int multiplo3) {
        this.multiplo4 = multiplo4;
        this.multiplo1 = multiplo1;
        this.multiplo2 = multiplo2;
        this.multiplo5 = multiplo5;
        this.multiplo3 = multiplo3;
    }

    //Generar Getter and Setter.
    public double getMultiplo1() {
        return multiplo1;
    }

    public void setMultiplo1(double multiplo1) {
        this.multiplo1 = multiplo1;
    }

    public double getMultiplo2() {
        return multiplo2;
    }

    public void setMultiplo2(double multiplo2) {
        this.multiplo2 = multiplo2;
    }

    public double getMultiplo5() {
        return multiplo5;
    }

    public void setMultiplo5(double multiplo5) {
        this.multiplo5 = multiplo5;
    }

    public int getMultiplo3() {
        return multiplo3;
    }

    public void setMultiplo3(int multiplo3) {
        this.multiplo3 = multiplo3;
    }

    public int getMultiplo4() {
        return multiplo4;
    }

    public void setMultiplo4(int multiplo4) {
        this.multiplo4 = multiplo4;
    }


    //Generar toString.
    @Override
    public String toString() {
        return "Producto{" +
                "multiplo1=" + multiplo1 +
                ", multiplo2=" + multiplo2 +
                ", multiplo5=" + multiplo5 +
                ", multiplo3=" + multiplo3 +
                ", multiplo4=" + multiplo4 +
                '}';
    }

}
