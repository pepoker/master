package pepoker.practicasJava;

import java.util.HashSet;
import java.util.Set;

public class letrasRepetidas {
    public letrasRepetidas() {
        super();
    }
    
    public static void main(String[] args){
        System.out.println(tieneLetraRepetida("holo"));
        System.out.println(tieneLetraRepetida("hola"));
    }
    
    protected static boolean tieneLetraRepetida(String palabra){
        Set<String> setLetras = new HashSet<String>();
                
        for (int i =0; i<palabra.length(); i++){
            if (!setLetras.add(Character.toString(palabra.charAt(i))))
                return true;
        }
        
        return false;
    }
}
