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
public class Empleados1Test {

    public Empleados1Test() {
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
     * Test of getIconImage method, of class Empleados1.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Empleados1 instance = new Empleados1();
        Image expResult = null;
        Image result = instance.getIconImage();
        if (result == null) {
            fail("Falló imagen Empleados");
        }
    }

    /**
     * Test of verificarDatosExistentes method, of class Empleados1.
     */
    @Test
    public void testVerificarDatosExistentes() {
        System.out.println("verificarDatosExistentes");
        String campo = "0801199500125";
        String columna = "Documento";
        String tabla = "Empleados";
        String mensaje = "dato repetido";
        Empleados1 instance = new Empleados1();
        boolean expResult = true;
        boolean result = instance.verificarDatosExistentes(campo, columna, tabla, mensaje);
        System.out.println(result);
        if (result != expResult) {
            fail("Dato incorrecto");
        }
    }

    /**
     * Test of ObtenerIdS method, of class Empleados1.
     */
    @Test
    public void testObtenerIdS() {
        System.out.println("ObtenerIdS");
        Empleados1 instance = new Empleados1();
        try {
            instance.ObtenerIdS();
        } catch (Exception e) {
            fail("Error no se obtuvo ningún empleado con el ID");
        }
    }

}
