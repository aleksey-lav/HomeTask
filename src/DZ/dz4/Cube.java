package DZ.dz4;

public class Cube extends AbstractShape {

    private double side;

    public Cube(double side){
        this.side = side;

    }

    @Override
    public double getArea() {
        return side*side;
    }
}
