package pepoker.practicasJava;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class SmallestDivided {
    
    public static int getSmallestNumberDividedFrom1toNumber(int number){
        int num = 2;
        while (true){
            if(isDividedUntil(num, number)){
                return num;
            }else{
                num++;
            }
                
        }
    }
    
    private static boolean isDividedUntil(int num, int maxVal){
        for (int i=2; i<=maxVal; i++){
            if(num%i!=0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.print("resss" + getSmallestNumberDividedFrom1toNumber(10));
    }
            
    
}
