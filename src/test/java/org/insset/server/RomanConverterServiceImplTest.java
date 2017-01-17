/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class RomanConverterServiceImplTest {
    
    public RomanConverterServiceImplTest() {
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
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertDateYears() {
        System.out.println("convertDateYears");
        String nbr = "";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "";
        String result = instance.convertDateYears(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertSingleRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertSingleRoman() {
        System.out.println("convertSingleRoman");
        char str = 'I';
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 1;
        Integer result = instance.convertSingleRoman(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testConvertSingleRomanKO() {
        System.out.println("convertSingleRomanKO");
        char str = 'z';
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 0;
        Integer result = instance.convertSingleRoman(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertRomanToArabe method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertRomanToArabe() {
        System.out.println("convertRomanToArabe");
        String nbr = "XVI";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 16;
        Integer result = instance.convertRomanToArabe(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman() {
        System.out.println("convertArabeToRoman");
        Integer nbr = null;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
