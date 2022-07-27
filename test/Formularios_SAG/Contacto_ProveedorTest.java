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
public class Contacto_ProveedorTest {

    public Contacto_ProveedorTest() {
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
     * Test of getIconImage method, of class Contacto_Proveedor.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Contacto_Proveedor instance = new Contacto_Proveedor();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("fallo imagen Contacto Proveedor");
        }
    }

   

    /**
     * Test of verificarDatosExistentes method, of class Contacto_Proveedor.
     */
    @Test
    public void testVerificarDatosExistentes() {
        System.out.println("verificarDatosExistentes");
        String campo = "98555554";
        String columna = "Telefono";
        String tabla = "Contacto_Proveedor";
        String mensaje = "dato repetido";
        Contacto_Proveedor instance = new Contacto_Proveedor();
        boolean expResult = true;
        boolean result = instance.verificarDatosExistentes(campo, columna, tabla, mensaje);
        if (result != expResult) {
            fail("dato incorrecto");
        }

    }

}
