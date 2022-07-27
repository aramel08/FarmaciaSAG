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
public class LoginTest {

    public LoginTest() {
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
     * Test of getIconImage method, of class Login.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Login instance = new Login();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("Falló imagen login");
        }

    }

    /**
     * Test of validarAdministradores method, of class Login.
     */
    @Test
    public void testValidarAdministradores() {
        System.out.println("validarAdministradores");
        Login instance = new Login();
        instance.txtUsuario.setText("admin");
        instance.txtContrasena.setText("farmaca");
        if (instance.validarAdministradores() == false) {
            fail("Inicio de sesión fallido");
        }
    }
}
