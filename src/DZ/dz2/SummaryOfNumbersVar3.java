package DZ.dz2;

import java.util.Scanner;

public class SummaryOfNumbersVar3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Сумма всех цифр равна: \n" + sum(number));
    }

    public static int sum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
