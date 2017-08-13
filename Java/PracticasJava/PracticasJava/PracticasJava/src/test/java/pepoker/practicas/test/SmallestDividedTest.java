/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.pepoker.practicas.test;

import org.junit.Test;
import static org.junit.Assert.*;
import pepoker.practicasJava.SmallestDivided;

/**
 *
 * @author eduardo
 */
public class SmallestDividedTest {
    
    public SmallestDividedTest() {
    }
    
    @Test
    public void testFailWith10(){
        assertFalse(2520 != SmallestDivided.getSmallestNumberDividedFrom1toNumber(10));
    }
    
    @Test
    public void testWith10(){
        assertTrue(2520 == SmallestDivided.getSmallestNumberDividedFrom1toNumber(10));
    }
    
    
    @Test
    public void testWith20(){
        assertEquals(232792560, SmallestDivided.getSmallestNumberDividedFrom1toNumber(20));
    }
}
