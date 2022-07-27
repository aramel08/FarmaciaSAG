/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import java.awt.Image;
import java.awt.event.KeyEvent;
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
public class PantallaComprasIT {
    
    public PantallaComprasIT() {
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
     * Test of getIconImage method, of class PantallaCompras.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Image expResult = null;
        if (expResult != null) {
            fail("The test case is a prototype.");
        }
    }

   
    /**
     * Test of main method, of class PantallaCompras.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PantallaCompras.main(args);
    }

    /**
     * Test of ObtenerID method, of class PantallaCompras.
     */
    @Test
    public void testObtenerID() {
        System.out.println("ObtenerID");
        String nombre = "Farmacar";
        boolean expResult = true;
        boolean result = true;
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ObtenerIdProd method, of class PantallaCompras.
     */
    @Test
    public void testObtenerIdProd() {
        System.out.println("ObtenerIdProd");
        boolean expResult = true;
        boolean result = true;
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cargarFact method, of class PantallaCompras.
     */
    @Test
    public void testCargarFact() {
        System.out.println("cargarFact");
        boolean expResult = true;
        boolean result = true;
        if (expResult != result) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cargarcampose method, of class PantallaCompras.
     */
    @Test
    public void testCargarcampose() {
        System.out.println("cargarcampose");
        int expResult = 1;
        int result = 1;
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
}
