/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import java.awt.Image;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arame
 */
public class SucursalesTest {

    public SucursalesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getIconImage method, of class Sucursales.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Sucursales instance = new Sucursales();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("fallo imagen Productos");
        }

    }

    /**
     * Test of verificarDatosExistentes method, of class Sucursales.
     */
    @Test
    public void testVerificarDatosExistentes() {
        System.out.println("verificarDatosExistentes");
        String campo = "97849521";
        String columna = "Telefono";
        String tabla = "Sucursal";
        String mensaje = "dato repetido";
        Sucursales instance = new Sucursales();
        boolean expResult = true;
        boolean result = instance.verificarDatosExistentes(campo, columna, tabla, mensaje);
        System.out.println(result);
        if (result != expResult) {
            fail("Dato incorrecto");
        }

    }

    /**
     * Test of validarNumCelular method, of class Sucursales.
     */
    @Test
    public void testValidarNumCelular() {
        System.out.println("validarNumCelular");
        String cadena = "sssss";
        Sucursales instance = new Sucursales();
        boolean expResult = true;
        boolean result = instance.validarNumCelular(cadena);
        if (expResult != result) {
            fail("The test case is a prototype.");

        }
    }

    /**
     * Test of verificarCaracteresRepetidos method, of class Sucursales.
     */
    @Test
    public void testVerificarCaracteresRepetidos() {
        System.out.println("verificarCaracteresRepetidos");
        String cadena = "23";
        Sucursales instance = new Sucursales();
        try {
            instance.verificarCaracteresRepetidos(cadena);
        } catch (Exception e) {
            fail("No se encontró ningún caracter repetido");
        }

    }

    
}
