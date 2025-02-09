package org.Calculadora;

public class Resta {

    //Clase creada por David Gómez Moreno

    private double numReal1;
    private double numReal2;
    private double numReal3;
    private int numInt1;
    private int numInt2;
    private double valorAcumulado = 0;


    //Metodos propios (David Gonzalez cambia a static los métodos)

    //Resta de dos reales
    public static double restaReales(double numReal1, double numReal2) {
        return numReal1 - numReal2;
    }


    //Resta de dos enteros
    public static double restaEnteros(int numInt1, int numInt2) {
        return numInt1 - numInt2;
    }

    //Resta de tres reales
    public static double restaTresReales(double numReal1, double numReal2, double numReal3) {
        return numReal1 - numReal2 - numReal3;
    }

    //Resta de valor acumulado
    //public static double restaValorAcumulado(double valor) {

       //valorAcumulado -= valor;

        //return valorAcumulado;
    //}
}