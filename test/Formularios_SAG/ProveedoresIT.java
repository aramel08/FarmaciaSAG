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
public class ProveedoresIT {
    
    public ProveedoresIT() {
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
     * Test of getIconImage method, of class Proveedores.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Proveedores instance = new Proveedores();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("Falló imagen proovedores");
        }
    }

    /**
     * Test of verificarDatosExistentes method, of class Proveedores.
     */
    @Test
    public void testVerificarDatosExistentes() {
        System.out.println("verificarDatosExistentes");
        String campo = "95485236";
        String columna = "Telefono";
        String tabla = "Proveedor";
        String mensaje = "Dato repetido";
        Proveedores instance = new Proveedores();
        boolean expResult = true;
        boolean result = instance.verificarDatosExistentes(campo, columna, tabla, mensaje);
        System.out.println(result);
        if (result != expResult) {
            fail("Dato incorrecto");
        }
    }

    /**
     * Test of validarNumCelular method, of class Proveedores.
     */
    @Test
    public void testValidarNumCelular() {
        System.out.println("validarNumCelular");
        String cadena = "98933743";
        Proveedores instance = new Proveedores();
        boolean expResult = true;
        boolean result = instance.validarNumCelular(cadena);
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }
}
