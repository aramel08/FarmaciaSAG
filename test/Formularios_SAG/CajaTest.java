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
public class CajaTest {

    public CajaTest() {
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
     * Test of getIconImage method, of class Caja.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Caja instance = new Caja();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("fallo imagen Inventario");
        }
    }

    /**
     * Test of ObtenerSucursal method, of class Caja.
     */
    @Test
    public void testObtenerSucursal() {
        System.out.println("ObtenerSucursal");
        Caja instance = new Caja();
        try {
            instance.ObtenerSucursal();
        } catch (Exception e) {
            fail("Error al obtener las sucursales");
        }
    }
}
