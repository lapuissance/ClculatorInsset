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
    public void testConvertDateYearsFormatAOK() {
        System.out.println("convertDateYears");
        String date = "14/09/1980";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XIV/IX/MCMLXXX";
        String result = instance.convertDateYears(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertDateYearsFormatBOK() {
        System.out.println("convertDateYears");
        String date = "14-09-1980";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XIV/IX/MCMLXXX";
        String result = instance.convertDateYears(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConvertDateYearsInvalidDateFormat() {
        System.out.println("convertDateYears");
        String date = "1904*209*1980";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        instance.convertDateYears(date);
    }
    
    /**
     * Add function convert Roman to Arab
     * Test of convertSingleRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        char str = 'I';
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 1;
        Integer result = instance.value(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValueKO() {
        System.out.println("valueKO");
        char str = 'z';
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 0;
        Integer result = instance.value(str);
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
    public void testConvertArabeToRomanOK() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 16;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XVI";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConvertArabeToRomanLessThanOne() {
        System.out.println("convertArabeToRomanInvalidInput");
        Integer nbr = 0;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String result = instance.convertArabeToRoman(nbr);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConvertArabeToRomanMoreThanTwoThousand() {
        System.out.println("convertArabeToRomanInvalidInput");
        Integer nbr = 2001;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        instance.convertArabeToRoman(nbr);
    }
}