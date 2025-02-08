package org.Calculadora;

import java.util.Scanner;


public class TestMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcion;
        do {
            System.out.println("\n ¿Qué operación desea realizar?");
            System.out.println("Operaciones de tipo Suma (S)");
            System.out.println("Operaciones de tipo Resta (R)");
            System.out.println("Operaciones de tipo Producto (P)");
            System.out.println("Operaciones de tipo División (D)");
            System.out.println("Operaciones de tipo Módulo (M)");
            System.out.println("SALIDA DEL PROGRAMA (X)");

            opcion = sc.next().toUpperCase().charAt(0);
            switch (opcion) {
                case 'S':
                    System.out.println("Suma de dos números reales: ");
                    System.out.println(Suma.sumaReales(3.4, 6.5));

                    System.out.println("Suma de dos números enteros: ");
                    System.out.println(Suma.sumaEnteros(4, 9));

                    System.out.println("Suma de tres números reales: ");
                    System.out.println(Suma.sumaTresReales(6.5, 8.1, 6.4));
                    System.out.println("Suma con valor acumulado: ");
                    System.out.println(Suma.sumaConAcumulado(8.2));

                    break;

                case 'R':
                    System.out.println("Resta de dos números reales");
                    Resta.restaReales(6.5, 2.6);

                    System.out.println("Resta de dos números enteros");
                    Resta.restaEnteros(4, 9);

                    System.out.println("Resta de tres números reales");
                    Resta.restaTresReales(12.5, 5.6, 1.3);

                    //System.out.println("Resta con valor acumulado");
                    //

                    break;

              /*  case 'P':
                    System.out.println("Resta de dos números reales");
                    Resta.restaReales(6.5, 2.6);

                    System.out.println("Resta de dos números enteros");
                    Resta.restaEnteros(4, 9);

                    System.out.println("Resta de tres números reales");
                    Resta.restaTresReales(12.5, 5.6, 1.3);
                    //case '4':
                    //System.out.println("Resta con valor acumulado");
                    //Resta.restaValorAcumulado(6);

                    break;*/
                case 'X':
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("Opción no válida, prueba otra operación");

            }


        } while (opcion != 'X');
        sc.close();
        System.out.println("FIN DEL PROGRAMA");

    }

}
