package DZ.dz3;

import java.util.Scanner;

public class Circle implements Shape {
    double radius;
    final double piValue = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius*radius*piValue;
    }
    public static void main(String[] args) {
        System.out.println("Чтоб посчитать площадь круга, введите радиус: ");
        Scanner in = new Scanner(System.in);
        Circle circle = new Circle(in.nextDouble());
        System.out.println("Площадь равняется = " + circle.getArea());
    }
}
