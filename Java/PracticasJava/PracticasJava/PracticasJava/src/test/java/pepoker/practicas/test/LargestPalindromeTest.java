/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.pepoker.practicas.test;

import org.junit.Test;
import static org.junit.Assert.*;
import pepoker.practicasJava.LargestPalindrome;

/**
 *
 * @author eduardo
 */
public class LargestPalindromeTest {
    
    public LargestPalindromeTest() {
    }
    
    @Test
    public void testGetLargestPalindromeConCeroDigitos() {
        assertEquals("El resultado no es correcto", 0, LargestPalindrome.getLargestPalindrome(0));
    }
    
    @Test
    public void testGetLargestPalindromeConTresDigitos() {
        assertEquals("El resultado no es correcto", 906609, LargestPalindrome.getLargestPalindrome(3));
    }
    
    @Test
    public void testGetLargestPalindromeConCincoDigitos() {
        assertEquals("El resultado no es correcto", 2147447412, LargestPalindrome.getLargestPalindrome(5));
    }

    @Test
    public void testGetLargestPalindromeReverseConCeroDigitos() {
        assertEquals("El resultado no es correcto", 0, LargestPalindrome.getLargestPalindromeReverse(0));

    }

    @Test
    public void testGetLargestPalindromeReverseConTresDigitos() {
        assertEquals("El resultado no es correcto", 906609, LargestPalindrome.getLargestPalindromeReverse(3));
    }
    
    @Test
    public void testGetLargestPalindromeReverseConCincoDigitos() {
        assertEquals("El resultado no es correcto", 2147447412, LargestPalindrome.getLargestPalindromeReverse(5));
    }
    
    @Test
    public void testGetLargestPalindromeReverseFailTresDigitos() {
        assertNotEquals("El resultado no es correcto", 3, LargestPalindrome.getLargestPalindromeReverse(3));
    }
}
