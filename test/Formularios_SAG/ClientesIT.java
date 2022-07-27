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
public class ClientesIT {

    public ClientesIT() {
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
     * Test of getIconImage method, of class Clientes.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Clientes instance = new Clientes();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("fallo imagen clientes");
        }

    }

    /**
     * Test of verificarDatosExistentes method, of class Clientes.
     */
    @Test
    public void testVerificarDatosExistentes() {
        System.out.println("verificarDatosExistentes");
        String campo = "97948541";
        String columna = "Telefono";
        String tabla = "Cliente";
        String mensaje = "dato repetido";
        Clientes instance = new Clientes();
        boolean expResult = true;
        boolean result = instance.verificarDatosExistentes(campo, columna, tabla, mensaje);
        if (result != expResult) {
            fail("dato incorrecto");
        }

    }

    /**
     * Test of validarNumCelular method, of class Clientes.
     */
    @Test
    public void testValidarNumCelular() {
        System.out.println("validarNumCelular");
        String cadena = "ssssss";
        Clientes instance = new Clientes();
        boolean expResult = true;
        boolean result = instance.validarNumCelular(cadena);
        if (expResult != result) {
            fail("The test case is a prototype.");

        }

    }

}
