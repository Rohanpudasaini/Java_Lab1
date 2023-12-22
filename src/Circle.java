public class Circle extends Shape {
    private double r;
    private double PI = Math.PI;
    public Circle(double radius) {
        this.r = radius;
    }
    @Override
    double getPerimeter() {
        return (2 * PI * r);
    }

    @Override
    double getArea() {
        return (PI * r * r);
    }

}
