package DZ.dz4;

public class Circle extends AbstractShape {

    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
