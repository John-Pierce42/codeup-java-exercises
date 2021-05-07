package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int lengthNum, int widthNum){
        super(lengthNum, widthNum);
    }

    public void setLength() {

    }

    public void setWidth() {

    }


    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }


    public double getArea() {
        return length * width;
    }

//    protected int length;
//    protected int width;
//
//    public Rectangle(int lengthNum, int widthNum){
//        this.length = lengthNum;
//        this.width = widthNum;
//    }
//
////    public Rectangle(int side) {
////        this.length = side;
////        this.width = side;
////    }
//
//    public  int getArea(){
//        return  length * width;
//    }
//
//    public int getPerimeter(){
//        return  2 * length + 2 * width;
//    }


}
