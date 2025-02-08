package org.Calculadora;

public class Suma {

        private double num1, num2, num5;
        private int num3, num4;
        private double valorAcumulado;

        //CONSTRUCTOR CON TODOS LOS PARAMETROS
    public Suma(double num1, double num2, double num5, int num3, int num4,
                double valorAcumulado) {
        this.num1 = num1;
        this.num2 = num2;
        this.num5 = num5;
        this.num3 = num3;
        this.num4 = num4;
        this.valorAcumulado = valorAcumulado;
    }
    //CONSTRUCTOR SIN PARAMETROS
    public Suma() {
    }
    //GETTERS Y SETTERS
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
    //TOSTRING
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

        //METODO DE SUMA DE 2 REALES
        public static double sumaReales(double num1, double num2) {
            return num1 + num2;
        }

        // METODO DE SUMA DE 2 ENTEROS
        public static int sumaEnteros(int num3, int num4) {
            return num3 + num4;
        }

        // METODO DE SUMA DE 3 REALES
        public static double sumaTresReales(double num1, double num2, double num3) {
            return num1 + num2 + num3;
        }

        // METODO PARA OBTENER EL VALOR ACUMULADO CON VARIABLE VALOR
        public static double sumaConAcumulado(double valor) {
            double valorAcumulado = 0;
            return valorAcumulado;
        }

    }

