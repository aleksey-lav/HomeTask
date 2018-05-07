package DZ.dz2;
import java.util.*;
import java.util.Scanner;


public class SummaryOfNumbersVar2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        long before = System.currentTimeMillis();
        char[] convert = str.toCharArray();

        int sum = 0;
        for (int i = 0; i < convert.length; i++) {
            sum += Character.getNumericValue(convert[i]);
        }

        System.out.println("Сумма всех цивр равняется: " + sum);
        long after = System.currentTimeMillis();
        long diff = after-before;
        System.out.println("время выполнения программы : " + diff + " м/с");



    }
}
