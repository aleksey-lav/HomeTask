package DZ.dz1;
import  java.util.*;

public class PalindromeMaxOfFiveDigits {

    public static boolean isPalindrome(Long multiplication) {
       /* boolean isPalindrome = false;
        StringBuilder temp = new StringBuilder(Integer.toString(multiplication)).reverse();
        if(temp.toString().equals(Integer.toString(multiplication)))
        {
            isPalindrome=true;
        }
        return isPalindrome;*/
        String s = multiplication.toString();
        int lengthStr = s.length();
        for (int i = 0; i < lengthStr; i += 2) {
            if (s.charAt(i) != s.charAt(lengthStr-i-1))
                return false;
        }
        return true;
    }
    public static void main (String[] args)
    {
        int maxNumber = 99999;
        int minNumber = 10000;
        long multiplication = 0;
        long maxPalindrom = 0;
        int FirstNumber = 0;
        int SecondNumber = 0;
        long start = System.currentTimeMillis();
        for(int i = maxNumber; i > minNumber; i--){
            for (int j = i; j > minNumber; j--){
                if(i % 2 == 1 && j % 2 == 1) {
                    multiplication = i * j;
                    if (isPalindrome(multiplication)) {
                        if (multiplication > maxPalindrom) {
                            maxPalindrom = multiplication;
                            FirstNumber = i;
                            SecondNumber = j;
                        }
                    }
                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println(maxPalindrom);
        System.out.println(FirstNumber + " " + SecondNumber);
        System.out.println("time: " + (finish-start) + " мc");

    }
}
