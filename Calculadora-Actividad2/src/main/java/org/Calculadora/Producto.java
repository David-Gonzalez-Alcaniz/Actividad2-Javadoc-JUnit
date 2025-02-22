package org.Calculadora;
/**
 * La clase {Producto} proporciona métodos para realizar operaciones de multiplicación,
 * tanto con números reales, como enteros.
 * <p>
 * Incluye los métodos static para las tres operaciones comentadas. Además, cuenta
 * con Constructores, Getters and Setters y toString.
 * </p>
 * @author David González Alcañiz
 * @version 1.0
 * @see <a href= "https://github.com/David-Gonzalez-Alcaniz/Actividad2-Javadoc-JUnit.git" />Repositorio GitHub</a>
 */

public class Producto {

    /** CREACIÓN DE VARIABLES PRIVADAS. */

    private double multiplo1, multiplo2, multiplo5;
    private int multiplo3, multiplo4;

    /**
     * Atributos de clase:
     *
     * @param multiplo1         Multiplo real.
     * @param multiplo2         Multiplo real.
     * @param multiplo5         Multiplo real.
     * @param multiplo3         Multiplo entero.
     * @param multiplo4         Multiplo entero.
     */

    /**
     * MÉTODOS PROPIOS
     * <p>
     * 1. PRODUCTO DE DOS NÚMEROS REALES.
     * </p>
     * @param multiplo1         Multiplo real 1.
     * @param multiplo2         Multiplo real 2.
     * @return                  Producto de la multiplicación de dos números reales.
     */

    public static double producto2Reales (double multiplo1, double multiplo2){
        return multiplo1 * multiplo2;
    }

    /**
     * 2. PRODUCTO DE DOS NÚMEROS ENTEROS
     *
     * @param multiplo3         Multiplo entero 1.
     * @param multiplo4         Multiplo entero 2.
     * @return                  Producto de la multiplicación de dos números enteros.
     */

    public static int productoEnteros (int multiplo3, int multiplo4){
        return multiplo3 * multiplo4;
    }

    /**
     * 3. PRODUCTO DE TRES NÚMEROS REALES:
     *
     * @param multiplo1         Multiplo real 1.
     * @param multiplo2         Multiplo real 2.
     * @param multiplo5         Multiplo real 3.
     * @return                  Producto de la multiplicación de tres números reales.
     */

    public static double producto3Reales (double multiplo1, double multiplo2, double multiplo5) {
        return multiplo1 * multiplo2 * multiplo5;
    }


    /**
     * 4. CALULO DE UNA POTENCIA:
     *
     * @param multiplo1         Base.
     * @param multiplo2         Exponente.
     * @return                  Resultado de la potencia.
     */

    public static int calcularPotencia(int multiplo1, int multiplo2){
        int resultado = 1;
        for (int i = 0; i < multiplo2; i++) {
            resultado *= multiplo1;
        }
        return resultado;
    }

    /** GENERAR CONSTRUCTOR SIN PARÁMETROS. */

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

    /** GENERAR GETTER AND SETTER. */

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


    /** GENERAR METODO TOSTRING. */

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
