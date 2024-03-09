package zad4;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2)*Math.PI;
    }

    public double getCircumference() {
        return 2*radius*Math.PI;
    }
}
