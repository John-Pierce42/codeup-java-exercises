package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int lengthNum, int widthNum){
        this.length = lengthNum;
        this.width = widthNum;
    }

    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    public  int getArea(int area){
        return area = length * width;
    }

    public int getPerimeter(int perimeter){
        return perimeter = 2 * length + 2 * width;
    }


}
