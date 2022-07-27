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
public class Operaciones2Test {

    public Operaciones2Test() {
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
     * Test of getIconImage method, of class Operaciones2.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Operaciones2 instance = new Operaciones2();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("fallo imagen Productos");
        }

    }

    /**
     * Test of Validar_CampoHora method, of class Operaciones2.
     */
    @Test
    public void testValidar_CampoHora() {
        System.out.println("Validar_CampoHora");
        String Hora = "25:15";
        Operaciones2 instance = new Operaciones2();
        Boolean expResult = true;
        Boolean result = instance.Validar_CampoHora(Hora);
        if (result != expResult) {
            fail("dato incorrecto");
        }

    }

    /**
     * Test of ObtenerIdC method, of class Operaciones2.
     */
    @Test
    public void testObtenerIdC() {
        System.out.println("ObtenerIdC");
        Operaciones2 instance = new Operaciones2();
        try {
            instance.ObtenerIdC();
        } catch (Exception e) {
            fail("Error no se obtuvo ningún Id ");
        }
    }

    /**
     * Test of obtenerTarjeta method, of class Operaciones2.
     */
    @Test
    public void testObtenerTarjeta() {
        System.out.println("obtenerTarjeta");
        Operaciones2 instance = new Operaciones2();
        try {
            instance.obtenerTarjeta();
        } catch (Exception e) {
            fail("Error no se obtuvo ninguna tarjeta");
        }

    }

    /**
     * Test of obtenerEfectivo method, of class Operaciones2.
     */
    @Test
    public void testObtenerEfectivo() {
        System.out.println("obtenerEfectivo");
        Operaciones2 instance = new Operaciones2();
        instance.obtenerEfectivo();
        try {
            instance.obtenerEfectivo();
        } catch (Exception e) {
            fail("Error no se obtuvo ningún efectivo");
        }
    }

}
