package org.Calculadora;
/**
 * La clase {Resta} proporciona los métodos indicados en la actividad para operar con diferentes variables
 * únicamente con el operador - (resta).
 * Contamos con numeros reales y enteros, además de un metodo específico para acumular el valor obtenido
 * y poder seguir restando numeros.
 * @author David Gómez Moreno
 * @author David Gonzalez Alcañiz cambio de clases a static.
 * @see <a href= "https://github.com/David-Gonzalez-Alcaniz/Actividad2-Javadoc-JUnit.git" />Repositorio GitHub</a>
 */

public class Resta {

    /** VARIABLES PRIVADAS */

    private double numReal1;
    private double numReal2;
    private double numReal3;
    private int numInt1;
    private int numInt2;
    private static double valorAcumulado = 0;

    public Resta() {
    }

    public Resta(double numReal1, double numReal2, double numReal3, int numInt1, int numInt2) {
        this.numReal1 = numReal1;
        this.numReal2 = numReal2;
        this.numReal3 = numReal3;
        this.numInt1 = numInt1;
        this.numInt2 = numInt2;
    }

    public double getNumReal1() {
        return numReal1;
    }

    public void setNumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }

    public double getNumReal2() {
        return numReal2;
    }

    public void setNumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }

    public double getNumReal3() {
        return numReal3;
    }

    public void setNumReal3(double numReal3) {
        this.numReal3 = numReal3;
    }

    public int getNumInt1() {
        return numInt1;
    }

    public void setNumInt1(int numInt1) {
        this.numInt1 = numInt1;
    }

    public int getNumInt2() {
        return numInt2;
    }

    public void setNumInt2(int numInt2) {
        this.numInt2 = numInt2;
    }

    public static double getValorAcumulado() {
        return valorAcumulado;
    }

    public static void setValorAcumulado(double valorAcumulado) {
        Resta.valorAcumulado = valorAcumulado;
    }

    @Override
    public String toString() {
        return "Resta{" +
                "numReal1=" + numReal1 +
                ", numReal2=" + numReal2 +
                ", numReal3=" + numReal3 +
                ", numInt1=" + numInt1 +
                ", numInt2=" + numInt2 +
                '}';
    }

    /**
     *
     * @param numReal1 Numero real 1
     * @param numReal2 Numero real 2
     * @return Obtendrá el valor resultante de restar Numero Real 1 - Numero Real 2
     */


    //Resta de dos reales
    public static double restaReales(double numReal1, double numReal2) {
        return numReal1 - numReal2;
    }

    /**
     *
     * @param numInt1 Numero entero 1
     * @param numInt2 Numero entero 2
     * @return Obtendrá el valor resultante de restar Numero Entero 1 - Numero Entero 2
     */

    //Resta de dos enteros
    public static double restaEnteros(int numInt1, int numInt2) {
        return numInt1 - numInt2;
    }

    /**
     *
     * @param numReal1 Numero real 1
     * @param numReal2 Numero real 2
     * @param numReal3 Numero real 3
     * @return Obtendrá el valor resultante de restar Numero Real 1 - Numero Real 2 - Numero Real 3
     */

    //Resta de tres reales
    public static double restaTresReales(double numReal1, double numReal2, double numReal3) {
        return numReal1 - numReal2 - numReal3;
    }

    /**
     *
     * @param valor Introducimos un valor que se acumulará y se irá restando
     * @return
     */

    //Resta de valor acumulado
    public static double restaValorAcumulado(double valor) {

       valorAcumulado -= valor;

        return valorAcumulado;
    }
}