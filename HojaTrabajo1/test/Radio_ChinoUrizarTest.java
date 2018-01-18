/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class Radio_ChinoUrizarTest {
    
    public Radio_ChinoUrizarTest() {
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
     * Test of onOff method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testOnOff() {
        System.out.println("onOff");
        boolean e = true;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        boolean expResult = true;
        boolean result = instance.onOff(e);
        assertEquals(expResult, result);
        if(result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Switch method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSwitch() {
        System.out.println("Switch");
        boolean e = false;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        boolean expResult = false;
        boolean result = instance.Switch(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of siguiente method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        float a = 85.5F;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = 85.7F;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of anterior method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        float a = 90.7F;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = 90.5F;
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of guardar method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float e = 0.0F;
        int b = 0;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        instance.guardar(e, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarFav method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSeleccionarFav() {
        System.out.println("seleccionarFav");
        int b = 0;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = -1F;
        float result = instance.seleccionarFav(b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
    
}
