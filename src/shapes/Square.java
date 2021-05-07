package shapes;

public class Square extends Quadrilateral{


    public Square(int lengthNum, int widthNum){
        super(lengthNum, widthNum);
    }


    public void setLength() {

    }


    public void setWidth() {

    }


    public double getPerimeter() {
        return (length * 2) + (width *2);
    }


    public double getArea() {
        return length * width;
    }
//    protected int length;
//    protected int width;
//
//    public Square(int lengthNum, int widthNum) {
//        super(lengthNum, widthNum);
//        this.length = lengthNum;
//        this.width = widthNum;
//    }


//    public int side;
//
//    public Square (int side){
//        super(side, side);
//    }
//
////    public int getArea(){
////        return  side * side;
////    }
//
////    public int getPerimeter(int perimeter){
////        return perimeter = 4 * .side;
////    }



}
