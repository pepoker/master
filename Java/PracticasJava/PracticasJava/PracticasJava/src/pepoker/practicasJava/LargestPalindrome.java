package pepoker.practicasJava;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LargestPalindrome {
    static int count = 0;

    public LargestPalindrome() {
        super();
    }

    public static int getLargestPalindrome(int digitos) {
        int resp = 0;
        int min = getNumMinimoParaDigitos(digitos);
        int max = getNumMaximoParaDigitos(digitos);
        int temp = 0;

        List<String> palindromos = new ArrayList<String>();

        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                temp = i * j;
                if (temp > resp && isPalindrome(temp)) {
                    palindromos.add(i + "*" + j);
                    resp = temp;
                }
            }
        }

        System.out.println(palindromos);
        return resp;
    }

    public static int getLargestPalindromeReverse(int digitos) {
        int resp = 0;
        int min = getNumMinimoParaDigitos(digitos);
        int max = getNumMaximoParaDigitos(digitos);
        int temp = 0;

        List<String> palindromos = new ArrayList<String>();

        for (int i = max; i >= min; i--) {
            for (int j = max; j >= min; j--) {
                temp = i * j;
                if (temp > resp && isPalindrome(temp)) {
                    palindromos.add(i + "*" + j);
                    resp = temp;
                }
            }
        }

        return resp;
    }

    private static boolean isPalindrome(Integer num) {
        count++;
        StringBuilder i = new StringBuilder(num.toString());
        return i.toString().equals(i.reverse().toString());
    }

    private static int getNumMaximoParaDigitos(Integer digitos) {
        String max = "0";
        for (int i = 1; i <= digitos; i++) {
            max += "9";
        }
        return new Integer(max);
    }

    private static int getNumMinimoParaDigitos(Integer digitos) {
        String min = "1";
        for (int i = 1; i < digitos; i++) {
            min += "0";
        }
        return new Integer(min);
    }

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeInMillis());
        System.out.println(getLargestPalindrome(3));
        System.out.println(count);
        System.out.println(c.getInstance().getTimeInMillis());
        System.out.println(getLargestPalindromeReverse(3));
        System.out.println(count);
        System.out.println(c.getInstance().getTimeInMillis());
    }
}
