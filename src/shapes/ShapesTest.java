package shapes;



public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1);
//        System.out.println();
//        System.out.println("The perimeter of box 1 is : " + box1.getPerimeter());
//        System.out.println("The area of box 1 is : " + box1.getArea());
//        System.out.println();
//
//        Rectangle box2 = new Square(5);
//        System.out.println("The perimeter of box 2 is : " + box2.getPerimeter());
//        System.out.println("The area of box 2 is : " + box2.getArea());

        Measurable myShape;

        myShape = new Square(1,1);
        myShape = new Rectangle(1,1);

        Square square = new Square(2, 2);
        Rectangle rectangle = new Rectangle(1, 1);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println();

        System.out.println(myShape.getArea());

    }
}
