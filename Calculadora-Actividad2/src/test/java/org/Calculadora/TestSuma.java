package org.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSuma {
    public static void main(String[] args) {

        //Prueba de métodos.
        System.out.println(Suma.sumaReales(5.2, 6.3));
        System.out.println(Suma.sumaEnteros(6, 4));
        System.out.println(Suma.sumaTresReales(6.2, 5.1, 7.4));
        System.out.println(Suma.sumaConAcumulado(9.2));


    }
    private Suma suma1;

    @BeforeEach
    void setUp() {
        suma1 = new Suma();
    }

    @Test
    void sumaReales() {
        assertEquals(11.5, suma1.sumaReales(5.2, 6.3));
    }

    @Test
    void sumaEnteros() {
        assertEquals(10, suma1.sumaEnteros(6, 4));
    }

    @Test
    void sumaTresReales() {
        assertEquals(18.7, suma1.sumaTresReales(6.2, 5.1, 7.4));
    }

    @Test
    void sumaConAcumulado() {
        assertEquals(11.5, suma1.sumaConAcumulado(9.2));
    }
}
