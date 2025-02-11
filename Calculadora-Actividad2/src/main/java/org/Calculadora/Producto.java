package org.Calculadora;

//CLASE CREADA POR DAVID GONZÁLEZ ALCAÑIZ.

public class Producto {

    /** CREACION DE VARIABLES PRIVADAS. */

    private double multiplo1, multiplo2, multiplo5;
    private int multiplo3, multiplo4;

    /**
     * METODOS PROPIOS
     * <p>
     * 1. PRODUCTO DE DOS NUMEROS REALES.
     * </p>
     * @param multiplo1         Multiplo real 1.
     * @param multiplo2         Multiplo real 2.
     * @return
     */

    public static double producto2Reales (double multiplo1, double multiplo2){
        return multiplo1 * multiplo2;
    }

    /**
     * 2. PRODUCTO DE DOS NUMEROS ENTEROS
     *
     * @param multiplo3         Multiplo entero 1.
     * @param multiplo4         Multiplo entero 2.
     * @return
     */

    public static int productoEnteros (int multiplo3, int multiplo4){
        return multiplo3 * multiplo4;
    }

    /**
     * 3. PRODUCTO DE TRES NUMEROS REALES:
     *
     * @param multiplo1         Multiplo real 1.
     * @param multiplo2         Multiplo real 2.
     * @param multiplo5         Multiplo real 3.
     * @return
     */

    public static double producto3Reales (double multiplo1, double multiplo2, double multiplo5) {
        return multiplo1 * multiplo2 * multiplo5;
    }

    /** GENERAR CONSTRUCTOR SIN PARAMETROS. */

    public Producto() {
    }

    /** GENERAR CONSTRUCTOR CON TODOS LOS DATOS. */

    public Producto(int multiplo4, double multiplo1, double multiplo2, double multiplo5, int multiplo3) {
        this.multiplo4 = multiplo4;
        this.multiplo1 = multiplo1;
        this.multiplo2 = multiplo2;
        this.multiplo5 = multiplo5;
        this.multiplo3 = multiplo3;
    }

    /** GENERAR GETTER AND SETTER.
     * @return
     */

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


    /** GENERAR METODO TOSTRING.
     * @return
     */

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
