package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args){

        Input inputTester = new Input();

        System.out.println("what is the radius of the circle?");
        double radius = inputTester.getDouble();

        Circle test = new Circle(radius);

        System.out.println(test.getArea());
        System.out.println(test.getCircumference());

    }
}
