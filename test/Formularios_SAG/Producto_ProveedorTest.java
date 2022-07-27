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
public class Producto_ProveedorTest {

    public Producto_ProveedorTest() {
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
     * Test of getIconImage method, of class Producto_Proveedor.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Producto_Proveedor instance = new Producto_Proveedor();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("fallo imagen Productos");
        }
    }

   
    /**
     * Test of ObtenerIDProduct method, of class Producto_Proveedor.
     */
    @Test
    public void testObtenerIDProduct() {
        System.out.println("ObtenerIDProduct");
        Producto_Proveedor instance = new Producto_Proveedor();
         try {
            instance.ObtenerIDProduct();
        } catch (Exception e) {
            fail("Error no se obtuvo ningún total");
        }



    }

    
}
