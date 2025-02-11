package org.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestModulo {
    public static void main(String[] args) {

         //PRUEBA TEST DE CLASE MÓDULO:

        //Módulo de la división de dos números enteros:
        System.out.println(Modulo.calculoModulo(359,27));

        //Módulo de la división entre 2 enteros, siendo int b = 0:
        System.out.println(Modulo.calculoModulo(9,0));

        //Valor absoluto de número real:
        System.out.println(Modulo.calculoValorAbsoluto(2.5));
    }

    private Modulo modulo1;

    @BeforeEach
    void setUp() {
        modulo1 = new Modulo();
    }

    @Test
    void calculoModulo() {
        assertEquals(8, modulo1.calculoModulo(359,27));

    }

    @Test
    void calculoValorAbsoluto() {
        assertEquals(8, modulo1.calculoValorAbsoluto(2.5));
    }
}
