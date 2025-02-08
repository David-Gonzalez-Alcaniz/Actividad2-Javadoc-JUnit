package org.Calculadora;

import org.Calculadora.Suma;

import static org.Calculadora.Suma.*;

import java.util.Scanner;

public class TestSuma {
    public static void main(String[] args) {

        //Prueba de métodos.
        System.out.println(Suma.sumaReales(5.2, 6.3));
        System.out.println(Suma.sumaEnteros(6, 4));
        System.out.println(Suma.sumaTresReales(6.2, 5.1, 7.4));
        System.out.println(Suma.sumaConAcumulado(9.2));


    }
}
