package DZ.dz1;

import java.util.*;

public class PalindromeMaxOfFiveDigits {

    public static boolean isPalindrome(Long multiplication) {

        /*String s = multiplication.toString();
        int lengthStr = s.length();
        for (int i = 0; i < lengthStr; i++) {
            if (s.charAt(i) != s.charAt( (lengthStr - i - 1)))
                return false;
        }
        return true;*/
        long remainder = 0;
        long sum = 0;
        long temp = multiplication;
        while(temp > 0){
            remainder = temp % 10;  //getting remainder
            sum = (sum * 10) + remainder;
            temp = temp / 10;
        }
        if(sum == multiplication)
            return true;
        else
            return false;
    }
    public static boolean isSimple(int number) {
        boolean issimple = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                issimple = false;
                break;
            }
        }
        return issimple;
    }
    public static void main(String[] args) {
        long multiplication = 0;
        long maxPalindrom = 0;
        int FirstNumber = 0;
        int SecondNumber = 0;
        long start = System.currentTimeMillis();
        int masOfSimpleNumbers[] = new int[99999];
        int count = 0;
        for (int i = 10000; i <= 99999; i++) {
            if (isSimple(i)) {
                masOfSimpleNumbers[count] = i;
                // System.out.print(masOfSimpleNumbers[count] + " ");
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = count - 1; j > i; j--) {
                multiplication = (long) masOfSimpleNumbers[i] * masOfSimpleNumbers[j];
                if ((maxPalindrom < multiplication) && isPalindrome(multiplication)){
                    maxPalindrom = multiplication;
                    FirstNumber = masOfSimpleNumbers[i];
                    SecondNumber = masOfSimpleNumbers[j];
                    break;
                }

            }
        }
        long finish = System.currentTimeMillis();
        System.out.println();
        System.out.println(maxPalindrom);
        System.out.println(FirstNumber + " " + SecondNumber);
        System.out.println("time: " + (finish-start) + " mc");
    }
}



