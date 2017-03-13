package pepoker.practicasJava;

public class Fibonnaci {
    
    public static void main(String[] args){
        int objetivo = 20000000;
        
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        int sumPar = 0;
        while(true){
            temp = num1+num2;
            num1 = num2;
            num2 = temp;
            if (temp>objetivo)
                break;
            
            if(temp%2==0){
                System.out.println("par"+temp);
                sumPar +=temp;
            }
        }
        
        System.out.println(sumPar);    
    }
    
}
