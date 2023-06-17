package gr.dimitris.java.oop.point;

public class Point2D extends Point{
    private int y;

    public Point2D(){}

    public Point2D(int x, int y){
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    @Override
//    public String converToString() {
//        return super.converToString() + "(" + y + ")";
//    }

    @Override
    public String toString(){
        return "(" + getX() + ")";
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }
}
