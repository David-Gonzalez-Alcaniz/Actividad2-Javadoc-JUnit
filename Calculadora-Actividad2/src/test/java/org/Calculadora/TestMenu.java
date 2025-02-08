package org.Calculadora;

import org.Calculadora.Suma;
import org.Calculadora.Resta;
import org.Calculadora.Producto;
import org.Calculadora.Division;
import org.Calculadora.Modulo;

import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcion;
        do {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("Operaciones de tipo Suma (S)");
            System.out.println("Operaciones de tipo Resta (R)");
            System.out.println("Operaciones de tipo Producto (P)");
            System.out.println("Operaciones de tipo División (D)");
            System.out.println("Operaciones de tipo Módulo (M)");

            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'S':
                    System.out.println("Suma de dos números reales");
                    Suma.sumaReales(3.4, 6.5);

                    System.out.println("Suma de dos números enteros");
                    Suma.sumaEnteros(4, 9);

                    System.out.println("Suma de tres números reales");
                    Suma.sumaTresReales(6.5, 8.1, 6.4);

                    System.out.println("Suma con valor acumulado");
                    Suma.sumaConAcumulado(8.2);

                case 'R':
                    System.out.println("Resta de dos números reales");
                    Resta.restaReales(6.5, 2.6);

                    System.out.println("Resta de dos números enteros");
                    Resta.restaEnteros(4, 9);

                    System.out.println("Resta de tres números reales");
                    Resta.restaTresReales(12.5, 5.6, 1.3);

                    //System.out.println("Resta con valor acumulado");
                    //Resta.restaValorAcumulado(6);

                case 'P':
                    System.out.println("Resta de dos números reales");
                    Resta.restaReales(6.5, 2.6);

                    System.out.println("Resta de dos números enteros");
                    Resta.restaEnteros(4, 9);

                    System.out.println("Resta de tres números reales");
                    Resta.restaTresReales(12.5, 5.6, 1.3);
                    //case '4':
                    //System.out.println("Resta con valor acumulado");
                    //Resta.restaValorAcumulado(6);

            }


        } while (opcion != 'X');


    }

}
