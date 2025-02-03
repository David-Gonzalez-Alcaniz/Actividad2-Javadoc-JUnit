package org.Calculadora;
 // CLASE ZAIRA GONZALEZ --> MODULO
public class Modulo {
	/*
	Esta clase proporciona operaciones relacionadas con el módulo (residuo de una división) y el valor
	absoluto.
	*/

    private int a;
    private int b;

    public Modulo(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Modulo() {
        super();
    }

    public int geta() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "claseEj [a=" + a + ", b=" + b +  "]";
    }

    //METODOS
	/*
	 * 1. Cálculo del módulo (residuo de una división entera).
	o Entrada: int a, int b
	o Salida: int (el residuo de la división de a entre b)
	o Fórmula:
	▪ Residuo: M = a % b
	 */

    public int calculoModulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División entre 0 NO permitido");
        }
        return a % b;
    }
	/*
	 * 2. Cálculo del valor absoluto de un número.
	o Entrada: double a
	o Salida: double (el valor absoluto de a)
	o Fórmula:
	▪ Si a ≥ 0, entonces |a| = a
	▪ Si a < 0, entonces |a| = -a
	*/

    public double calculoValorAbsoluto(double a) {
        if (a >= 0)
            return a;
        return - a;
    }

}
