package org.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestResta {
    public static void main(String[] args) {

        //Resta de dos numeros reales
        System.out.println("Resta 2 numeros reales: " + Resta.restaReales(10.5, 5.5));
        //Resta de 2 numeros enteros
        System.out.println("Resta 2 numeros enters: " + Resta.restaEnteros(10, 5));
        //Resta de 3 numeros reales
        System.out.println("Resta de 3 numeros reales: " + Resta.restaTresReales(20.5, 5.5, 4.5));
    }


    private Resta resta1;


    @BeforeEach
    void setUp() {
        resta1 = new Resta();
    }

    @Test
    void restaReales() {
        resta1.restaReales(10.5, 5.5);
        assertEquals(5.0, Resta.restaEnteros(10, 5));
    }

    @Test
    void restaEnteros() {
        resta1.restaEnteros(10, 5);
        assertEquals(5, Resta.restaEnteros(10, 5));
    }

    @Test
    void restaTresReales() {
        resta1.restaTresReales(20.5, 5.5, 4.5);
        assertEquals(10.5, Resta.restaTresReales(20.5, 5.5, 4.5));
    }
}