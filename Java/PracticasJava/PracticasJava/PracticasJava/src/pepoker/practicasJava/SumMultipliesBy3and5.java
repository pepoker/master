/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepoker.practicasJava;

/**
 *
 * @author eduardo
 */
public class SumMultipliesBy3and5 {
    public static int getSumNumberMultipliesBy3and5(int numero){
        int resp = 0;
        
        for(int i= 0; i< numero; i++){
            if(i%3 == 0 || i%5== 0){
                resp+=i;
            }
        }
        
        return resp;
    }
    
    public static void main(String[] args) {
        System.err.println(SumMultipliesBy3and5.getSumNumberMultipliesBy3and5(10));
    }
            
}
