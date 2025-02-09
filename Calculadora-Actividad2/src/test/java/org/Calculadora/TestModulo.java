package org.Calculadora;

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

    @Test
    void calculoModulo() {
        Modulo modulo1 = new Modulo(359,27);
        assertAll(
                () -> assertEquals(8, modulo1.calculoModulo(359, 27))
        );
    }


    @Test
    void calculoValorAbsoluto() {
        Modulo modulo3 = new Modulo();
        assertAll(
                () -> assertEquals(2.5, modulo3.calculoValorAbsoluto(2.5))
        );
    }
}
