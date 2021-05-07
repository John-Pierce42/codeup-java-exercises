package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int lengthNum, int widthNum) {
        this.length = lengthNum;
        this.width = widthNum;
    }
        public int getLength(){
            return this.length;
        };

        public abstract void setLength();


        public int getWidth(){
            return this.width;
        };

        public abstract void setWidth();




}
