/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

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
public class GerenciaSucursalTest {

    public GerenciaSucursalTest() {
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
     * Test of ObtenerID method, of class GerenciaSucursal.
     */
    @Test
    public void testObtenerID() {
        System.out.println("ObtenerID");
        GerenciaSucursal instance = new GerenciaSucursal();
        try {
            instance.ObtenerID();
        } catch (Exception e) {
            fail("Error no se obtuvo ningún ID");
        }

    }

    /**
     * Test of ObtenerIdS method, of class GerenciaSucursal.
     */
    @Test
    public void testObtenerIdS() {
        System.out.println("ObtenerIdS");
        GerenciaSucursal instance = new GerenciaSucursal();
        try {
            instance.ObtenerIdS();
        } catch (Exception e) {
            fail("Error no se obtuvo ningún ID sucursal");
        }

    }

}
