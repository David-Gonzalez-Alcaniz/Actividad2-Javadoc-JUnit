package org.Calculadora;
    /**
    * La clase {Suma} proporciona métodos para realizar operaciones de suma
    * con números reales y enteros. También incluye un sistema de acumulación de valores.
    * <p>
    * Incluye métodos static para realizar sumas sin necesidad de instanciar la clase.
    * Además, cuenta con constructores, getters, setters y un toString.
    * </p>
    *  @author [Francisco José Soria Navarrete]
    * @version 1.0
    */

public class Suma {

        private double num1, num2, num5;
        private int num3, num4;
        private double valorAcumulado;
    /**
     *  Atributos de la clase.
     *
     * @param num1            Primer número real
     * @param num2            Segundo número real
     * @param num5            Tercer número real
     * @param num3            Primer número entero
     * @param num4            Segundo número entero
     * @param valorAcumulado  Valor acumulado para operaciones posteriores
     */

    /** CONSTRUCTOR CON TODOS LOS PARAMETROS*/
    public Suma(double num1, double num2, double num5, int num3, int num4,
                double valorAcumulado) {
        this.num1 = num1;
        this.num2 = num2;
        this.num5 = num5;
        this.num3 = num3;
        this.num4 = num4;
        this.valorAcumulado = valorAcumulado;
    }

    /**
     * CONSTRUCTOR VACIO SIN PARAMETROS
     */
    public Suma() {
    }
   /** GETTERS Y SETTERS */
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
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

    public double getValorAcumulado() {
        return valorAcumulado;
    }

    public void setValorAcumulado(double valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }
    /** METODO TOSTRING QUE DEVUELVE UNA CADENA DE LOS ATRIBUTOS */
    @Override
    public String toString() {
        return "Suma{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num5=" + num5 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", valorAcumulado=" + valorAcumulado +
                '}';
    }

    // METODOS PROPIOS (David Gonzalez cambia a static a los métodos).

    /**
     * Realiza la suma de dos números reales.
     *
     * @param num1 Primer número real
     * @param num2 Segundo número real
     * @return La suma de los dos números reales
     */

        public static double sumaReales(double num1, double num2) {
            return num1 + num2;
        }

    /**
     * Realiza la suma de dos números enteros.
     *
     * @param num3 Primer número entero
     * @param num4 Segundo número entero
     * @return La suma de los dos números enteros
     */
        public static int sumaEnteros(int num3, int num4) {
            return num3 + num4;
        }

    /**
     * Realiza la suma de tres números reales.
     *
     * @param num1 Primer número real
     * @param num2 Segundo número real
     * @param num3 Tercer número real
     * @return La suma de los tres números reales
     */

        public static double sumaTresReales(double num1, double num2, double num3) {
            return (double) num1 + num2 + num3;
        }

    /**
     * Devuelve el valor acumulado.
     *
     * @param valor de tipo double
     * @return valorAcumulado
     */

        public static double sumaConAcumulado(double valor) {
            double valorAcumulado = 0;
            return valorAcumulado;
        }

    }

