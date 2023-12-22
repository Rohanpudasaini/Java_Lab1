public class ShapeMain {
    public static void main(String[] args) {
        System.out.println("\nFor Circle");
        Circle circle1 = new Circle(7);
        System.out.println(" perimeter of Circle is: "+ circle1.getArea());
        System.out.println(" Area of Circle is: "+ circle1.getPerimeter());

        System.out.println("\nFor Rectangle");
        Rectangle rectangle1 = new Rectangle(5, 8);
        System.out.println(" Perimeter of Rectangle is: "+ rectangle1.getArea());
        System.out.println(" Area of Rectangle is: "+ rectangle1.getPerimeter());

    }
}
