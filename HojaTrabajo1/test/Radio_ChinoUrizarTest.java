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
        
    }

        /**
     * Test of onOff method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testOnOff2() {
        System.out.println("onOff");
        boolean e = false;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();

    }
    /**
     * Test of Switch method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSwitch() {
        System.out.println("Switch");
        boolean e = false;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = 0;
        float result = instance.Switch();
    }

        /**
     * Test of Switch method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSwitch2() {
        System.out.println("Switch");
        boolean e = true;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = 0;
        float result = instance.Switch();

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
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of siguiente method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSiguiente2() {
        System.out.println("siguiente");
        float a = 1600.0F;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        instance.Switch();
        float expResult = 1605.0F;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    /**
     * Test of anterior method con emisora FM, of class Radio_ChinoUrizar.
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
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of anterior method con emisora AM, of class Radio_ChinoUrizar.
     */
    @Test
    public void testAnterior2() {
        System.out.println("anterior");
        float a = 1600.0F;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = 1595.0F;
        instance.Switch();
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of guardar method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float e = 89.5F;
        int b = 5;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        instance.guardar(e, b);
        float result = instance.seleccionarFav(5);
        float expResult = (float)89.5;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
           fail("The test case is a prototype."); 
        }
    }

    /**
     * Test of seleccionarFav method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSeleccionarFav() {
        System.out.println("seleccionarFav");
        int b = 2;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = 96.5F;
        instance.guardar((float)96.5, 2);
        float result = instance.seleccionarFav(b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of seleccionarFav method, of class Radio_ChinoUrizar.
     */
    @Test
    public void testSeleccionarFav2() {
        System.out.println("seleccionarFav");
        int b = 10;
        Radio_ChinoUrizar instance = new Radio_ChinoUrizar();
        float expResult = 1565.5F;
        instance.guardar((float)1565.5, 10);
        float result = instance.seleccionarFav(b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
}
