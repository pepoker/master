package pepoker.practicasJava;

import static org.junit.Assert.*;
import org.junit.Test;

public class letrasRepetidasTest {
    public letrasRepetidasTest() {
    }

    @Test
    public void testTieneLetrasRepetidasConHola() {
        assertFalse("Hola No tiene repetidos", letrasRepetidas.tieneLetraRepetida("Hola"));
    }
    
    @Test
    public void testTieneLetrasRepetidasParaFalse(){
        assertFalse("Con pedro", tieneLetrasRepetidasConParametro("pedro"));
        assertFalse("Con juan", tieneLetrasRepetidasConParametro("juan"));
        assertFalse("Con Eduars", tieneLetrasRepetidasConParametro("Eduars"));
    }
    
    public static boolean tieneLetrasRepetidasConParametro(String parametro) {
        return letrasRepetidas.tieneLetraRepetida(parametro);
    }
    
    @Test
    public void testTieneLetrasRepetidasConVacio() {
        assertFalse("vacio No tiene repetidos", letrasRepetidas.tieneLetraRepetida(""));
    }
    
    @Test
    public void testTieneLetrasRepetidasParaTrue(){
        assertTrue("Con holo", tieneLetrasRepetidasConParametro("holo"));
        assertTrue("Con adfydretyerfv", tieneLetrasRepetidasConParametro("adfydretyerfv"));
    }
    
    @Test (expected = NullPointerException.class)
    public void testTieneLetrasRepetidasConNull() {
        assertTrue(tieneLetrasRepetidasConParametro(null));
    }
}
