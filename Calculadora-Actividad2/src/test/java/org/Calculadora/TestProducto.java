package org.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class

TestProducto {
    public static void main(String[] args) {


        System.out.println(Producto.producto2Reales(2.6, 5));

        System.out.println(Producto.productoEnteros(2, 6));

        System.out.println(Producto.producto3Reales(3,1,2));

        System.out.println(Producto.calcularPotencia(5, 3));


    }
    private Producto producto1;

    @BeforeEach
    void setUp() {
        producto1= new Producto();
    }

    @Test
    void producto2Reales() {
        assertEquals(13, producto1.producto2Reales(2.6, 5));
    }

    @Test
    void productoEnteros() {
        assertEquals(12, producto1.productoEnteros(2,6));
    }

    @Test
    void producto3Reales() {
        assertEquals(6, producto1.producto3Reales(3,1,2));
    }

    @Test
    void calcularPotencia() { assertEquals(125, producto1.calcularPotencia(5,3));
    }
}
