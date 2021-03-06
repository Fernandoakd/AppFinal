package com.example.carritojenkins;


import com.example.carritojenkins.entities.Carrito;
import com.example.carritojenkins.entities.DetalleProducto;
import com.example.carritojenkins.entities.Producto;
import com.example.carritojenkins.entities.Usuario;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agust
 */
@SpringBootTest
public class TestAgustin {
    Carrito carrito = null;
    Producto producto1 = null;
    Producto producto2 = null;
    DetalleProducto detallePrueba = null;
    List <DetalleProducto> detalles = null;
    Usuario usuario = null;
    private static final double DELTA = 1e-15;

    public TestAgustin() {
       usuario = new Usuario("Agustin");
       producto1 = new Producto();
       producto2 = new Producto();

    }

    @Before
    public void setUp() {
        
        usuario.loguearse();
        producto1.setPrecioProducto(100);
        producto2.setPrecioProducto(200);
        producto1.setStockProducto(20);
       producto2.setStockProducto(20);
    detalles = Arrays.asList(new DetalleProducto(producto1,1,100), new DetalleProducto(producto2,2,100));
        carrito = new Carrito(detalles, usuario);
    }
    
    /* Test 1 propuesto por Agustin */
    @Test
    public void testVerificacionLimpiarCarrito() {
        System.out.println("Limpiar Carrito");
        
        carrito.LimpiarCarrito();
        
        int expResult = 0;
        int result = carrito.getDetalles().size();
        
        assertEquals(expResult, result);
    }
    
    /* Test 2 propuesto por Agustin */
    @Test
    public void VerificarTotalFinalDeCompra() {
        System.out.println("Verificar Total Compra");

        // 500 en articulos + 105 en impuestos (21%) + $25 envio (5%)

        double expResult = 630;
        double result = carrito.montoFinal();
       assertEquals(expResult, result, DELTA);

    }

}
