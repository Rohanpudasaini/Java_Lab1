public class Rectangle extends Shape {
    private double length, breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double getPerimeter() {
        return (2 * (length + breadth));
    }

    @Override
    double getArea() {
        return (length * breadth);
    }

}
