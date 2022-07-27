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
public class LoginVendedoresTest {
    
    public LoginVendedoresTest() {
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
     * Test of getIconImage method, of class LoginVendedores.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        LoginVendedores instance = new LoginVendedores();
        Image expResult = null;
        Image result = instance.getIconImage();
        System.out.println(result);
        if (result == null) {
            fail("fallo imagen login Vendedores");
        }
        
    }

    /**
     * Test of validarVendedor method, of class LoginVendedores.
     */
    @Test
    public void testValidarVendedor() {
        System.out.println("validarVendedor");
        LoginVendedores instance = new LoginVendedores();
        instance.txtUsuarioV.setText("allissn");
        instance.txtContrasenaV.setText("allisson");
        if (instance.validarAdministradores()== false){
            fail("datos incorrectos");
        }
    }
}
