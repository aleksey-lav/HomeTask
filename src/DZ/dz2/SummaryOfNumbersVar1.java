package DZ.dz2;

import java.util.*;

public class SummaryOfNumbersVar1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;
        System.out.println("Сумма всех цифр равна: \n" + sum(number,result));
    }

    public static int sum(int number, int result) {
        if (number != 0) {
            result += number % 10;
           return sum(number / 10, result);
        }
        else
            return result;
    }
}
