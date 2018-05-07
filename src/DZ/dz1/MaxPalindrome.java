package DZ.dz1;
import  java.util.*;

public class MaxPalindrome {

    public static boolean isPalindrome(Integer multiplication) {
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
        int multiplication = 0;
        int maxPalindrom = 0;
        long start = System.currentTimeMillis();
        for(int i = 999; i > 100; i--){
            for (int j = i; j > 100; j--){
                multiplication = i * j;
                if(isPalindrome(multiplication)){
                    if(multiplication > maxPalindrom){ maxPalindrom = multiplication; }
                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println(maxPalindrom);
        System.out.println("time: " + (finish-start));
    }
}
