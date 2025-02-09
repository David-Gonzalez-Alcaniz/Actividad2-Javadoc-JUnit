package org.Calculadora;
/**
 * La clase Modulo proporciona operaciones relacionadas con el módulo (residuo de una división)
 * y el valor absoluto.
 *
 * @author [Zaira Gonzalez Encabo]
 * @version 1.0
 */
public class Modulo {
    /**
     * Primer numero entero
     */
    private int a;
    /**
     * Segundo numero entero
     */
    private int b;

    /**
     *  Atributos de la clase:
     *
     * @param a     Primer número
     * @param b     Segundo número
     */

    /**
     *  Constructor con todos los parámetros
     */
    public Modulo(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    /**
     *  Constructor sin parámetros
     */
    public Modulo() {
        super();
    }

    /**
     *  Getters and setters
     */

    /**
     * Devuelve el valor asignado al atributo a
     * @return El valor de a
     */
    public int getA() {
        return a;
    }

    /**
     * Establece el valor de a
     * @param a Nuevo valor para a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Devuelve el valor asignado al atributo b
     * @return El valor de b
     */
    public int getB() {
        return b;
    }

    /**
     * Establece el valor de b
     * @param b Nuevo valor para b
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     *  Método toString
     */
    @Override
    public String toString() {
        return "claseEj [a=" + a + ", b=" + b +  "]";
    }

    //METODOS

    /**
     * Calcula el módulo (residuo) de la división entre dos números enteros:
     *
     * @param a Primer número entero
     * @param b Segundo número entero
     * @return El residuo de la división entera de a entre b
     * @throws ArithmeticException Division entre 0 NO permitido
     */
    public static int calculoModulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División entre 0 NO permitido");
        }
        return a % b;
    }

    /**
     * Calcula el valor absoluto de un número real:
     *
     * @param a Número real
     * @return El valor absoluto de a
     */
    public static double calculoValorAbsoluto(double a) {
        if (a >= 0)
            return a;
        return - a;
    }

}
