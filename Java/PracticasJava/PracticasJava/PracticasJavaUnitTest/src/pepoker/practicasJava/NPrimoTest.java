package pepoker.practicasJava;

import static org.junit.Assert.*;
import org.junit.Test;

public class NPrimoTest {
    public NPrimoTest() {
    }


    @Test
    public void testGetNPrimeCon1() {
        assertTrue("El primer primo es 2", NPrimo.getNPrime(1)==2);
        assertFalse("El primer primo es 1", NPrimo.getNPrime(1)==1);
    }
    
    @Test
    public void testGetNPrimeCon1001() {
        assertTrue("El primo 1001 es 7927", NPrimo.getNPrime(1001)==7927);
    }
    
    @Test
    public void testGetNPrimeCon2() {
        assertTrue("El primo 2 es 3", NPrimo.getNPrime(2)==3);
    }
    
    @Test
    public void testGetNPrimeCon12434() {
        assertTrue("El primo 12434 es 133241", NPrimo.getNPrime(12434)==133241);
    }
}
