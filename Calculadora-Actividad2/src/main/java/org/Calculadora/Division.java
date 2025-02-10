package org.Calculadora;

/**
 * La clase {Division} proporciona métodos para realizar operaciones de divisón,
 * tanto con números reales, como con enteros. Además, incluímos un metodo para
 * la obtención del número inverso.
 * <p>
 * Incluye los métodos static para las tres operaciones comentadas. Además, cuenta
 * con Constructores, Getters and Setters y toString.
 * </p>
 * @author Alberto Balaguer Gómez
 * @author David Gonzalez (Realiza la modificación de cambiar a static los 3 metodos propios)
 * @version 1.0
 */


public class Division {

    /**
     * ATRIBUTOS DE CLASE:
     */

    private double real1, real2;
    private int num3, num4;
    private double num5;

    /**
     * @param real1 Primer número real.
     * @param real2 Segundo número real.
     * @param num3  Primer número entero.
     * @param num4  Segundo número entero.
     * @param num5  Tercer número real.
     */

    /** CONSTRUCTOR CON TODOS LOS CAMPOS SELECCIONADOS: */

    public Division(double real1, double real2, int num3, int num4, double num5) {
        super();
        this.real1 = real1;
        this.real2 = real2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    /**CONSTRUCTOR VACÍO SIN PARÁMETROS:*/

    public Division() {
        super();
    }

    /**GETTERS Y SETTERS:*/

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

    /**METODO toString, PARA OBTENER UNA CADENA DE LOS ATRIBUTOS:*/

    @Override
    public String toString() {
        return "Division [real1=" + real1 +
                ", real2=" + real2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", num5=" + num5
                + "]";
    }


    /** METODOS PROPIOS: David Gonzalez cambia a static los tres metodos */

    /**
     * METODO DE DIVISIÓN ENTRE NÚMEROS REALES:
     *
     * @param num1  Primer número real.
     * @param num2  Segundo número real.
     * @return  El cociente o producto de la división de los dos números reales.
     */

    public static double cocienteReales(double num1,double num2){
        return num1/num2;
    }

    /**
     * METODO DE DIVISION ENTRE NÚMEROS ENTEROS:
     *
     * @param num3  Primer número entero.
     * @param num4  Segundo número entero.
     * @return  El cociente o producto de la divsión de los dos números enteros.
     */

    public static double cocienteEnteros(int num3,int num4){
        return num3/num4;
    }

    /**
     * METODO DE nºINVERSO:
     *
     * @param num5  Tercer número real.
     * @return  El producto de calcular el número inverso del número real num5.
     */
    public static double numeroInverso(double num5){
        return 1/num5;
    }


}
