package org.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDivision {
public static void main(String[] args) {

    System.out.println(Division.cocienteEnteros(9,4));

    System.out.println(Division.cocienteReales(3.5,2.25));

    System.out.println(Division.numeroInverso(5.5));
            }

    private Division division1;


    @BeforeEach
    void setUp() {
        division1 = new Division();
    }

    @Test
    void cocienteReales() {
        assertEquals(1.5555555555555556,division1.cocienteReales(3.5,2.25));
    }

    @Test
    void cocienteEnteros() {
        assertEquals(2.25,division1.cocienteEnteros(9,4));
    }

    @Test
    void numeroInverso() {
        assertEquals(0.18181818181818182,division1.numeroInverso(5.5));
    }
}