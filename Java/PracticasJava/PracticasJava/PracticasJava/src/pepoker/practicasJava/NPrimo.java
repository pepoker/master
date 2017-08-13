package pepoker.practicasJava;


public class NPrimo {
    public static int getNPrime(int nPrime) {
        int contPrimo = 0;
        int num = 1;
        while (true) {

            if (isPrime(num)) {
                contPrimo++;
                if (contPrimo == nPrime)
                    return num;
            }
            num++;
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1)
            return false;

        if (num == 2)
            return true;

        if (num % 2 == 0)
            return false;

        for (int i = 3; i < num; i = i + 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(getNPrime(12434));
    }

}
