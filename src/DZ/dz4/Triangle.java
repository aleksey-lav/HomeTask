package DZ.dz4;

public class Triangle extends AbstractShape {

    public double side;
    public double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }
}
