package DZ.dz3;

import java.util.Scanner;

public class Figure implements Shape {
    final double piValue = 3.14;
    double side;
    double height;

    public Figure(double a) {
        this.side = a;
    }
    public Figure(double a, double h) {
        this.side = a;
        this.height = h;
    }
    @Override
    public double getAreaCircle() {
        return side*side*piValue;
    }
    @Override
    public double getAreaTriangle() {
        return (side*height)/2;
    }
    @Override
    public double getAreaSquare() {
        return side*side;
    }
    public static void main(String[] args) {
        System.out.println("Введите число, которое будет одновременно радиусом для круга\n или стороной для треуголника и кадрата: ");
        Scanner in = new Scanner(System.in);
        int sideOfFigure = in.nextInt();
        Scanner heighnt = new Scanner((System.in));
        System.out.println("Задайте высоту для треугольника: ");

        int heightOfFigure = heighnt.nextInt();
        Figure circle = new Figure(sideOfFigure);

        Figure tri = new Figure(sideOfFigure, heightOfFigure);
        Figure square = new Figure(sideOfFigure);

        System.out.println("Площадь круга равняется = " + circle.getAreaCircle());
        System.out.println("Площадь треугольника равняется = " + tri.getAreaTriangle());
        System.out.println("Площадь квадрата = " + square.getAreaSquare());
    }
}
