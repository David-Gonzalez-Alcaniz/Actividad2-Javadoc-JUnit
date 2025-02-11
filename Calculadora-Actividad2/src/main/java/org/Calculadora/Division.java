package org.Calculadora;

import javax.management.ConstructorParameters;

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

    private double dividendo1, divisor1;
    private int dividendo2, divisor2;
    private double num5;
    /**
     * @param dividendo1    Dividendo número real.
     * @param divisor1      Divisor número real.
     * @param dividendo2    Dividendo número entero.
     * @param divisor2      Divisor número entero.
     */

    /** CONSTRUCTOR CON TODOS LOS CAMPOS SELECCIONADOS: */

    public Division(double dividendo1, double divisor1, int dividendo2, int divisor2, double num5) {
        super();
        this.dividendo1 = dividendo1;
        this.divisor1 = divisor1;
        this.dividendo2 = dividendo2;
        this.divisor2 = divisor2;
        this.num5 = num5;
    }

    /**CONSTRUCTOR VACÍO SIN PARÁMETROS:*/

    public Division() {
        super();
    }

    /**GETTERS Y SETTERS:*/

    public double getDividendo1() {
        return dividendo1;
    }

    public void setDividendo1(double dividendo1) {
        this.dividendo1 = dividendo1;
    }

    public double getDivisor1() {
        return divisor1;
    }

    public void setDivisor1(double divisor1) {
        this.divisor1 = divisor1;
    }

    public int getDividendo2() {
        return dividendo2;
    }

    public void setDividendo2(int dividendo2) {
        this.dividendo2 = dividendo2;
    }

    public int getDivisor2() {
        return divisor2;
    }

    public void setDivisor2(int divisor2) {
        this.divisor2 = divisor2;
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
        return "Division [real1=" + dividendo1 +
                ", real2=" + divisor1 +
                ", num3=" + dividendo2 +
                ", num4=" + divisor2 +
                ", num5=" + num5
                + "]";
    }


    /** METODOS PROPIOS: David Gonzalez cambia a static los tres metodos */

    /**
     * METODO DE DIVISIÓN ENTRE NÚMEROS REALES:
     *
     * @param dividendo1    Dividendo número real.
     * @param divisor1      Divisor número real.
     * @return              El cociente o producto de la división de los dos números reales.
     */

    public static double cocienteReales(double dividendo1, double divisor1){
        if (divisor1 == 0){
            //throw new ArithmeticException("El divisor NO puede ser 0");
            System.out.println("El divisor no puede ser 0");
            return 0;
        }
        return dividendo1/divisor1;
    }


    /**
     * METODO DE DIVISION ENTRE NÚMEROS ENTEROS:
     * @param dividendo2    Dividendo número entero
     * @param divisor2      Divisor número entero.
     * @return              El cociente o producto de la división de los dos números enteros.
     */

    public static double cocienteEnteros(int dividendo2,int divisor2){
        if (divisor2 == 0){
            //throw new ArithmeticException("El divisor NO puede ser 0");
            System.out.println("El divisor NO puede ser 0");
            return 0;
        }
        return (double) dividendo2/divisor2;
    }

    /**
     * METODO DE nºINVERSO:
     *
     * @param num5      Tercer número real.
     * @return          El producto de calcular el número inverso del número real num5.
     */
    public static double numeroInverso(double num5){

        return 1/num5;
    }


}
