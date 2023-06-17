package gr.dimitris.java.oop.point;

/**
 * A simple {@link Point} Java Bean.
 */
public class Point {
    private int x;

    public Point(){
    }

    public Point(int x){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String converToString(){
        return "(" + x + ")";
    }

    protected void movePlusOne(){
        x += 1;
    }

    public void movePlus10(){
        //x += 10;

        for (int i = 1; i <= 10; i++){
            movePlusOne();
        }
    }

    private void reset(){
        x = 0;
    }

    @Override
    public String toString(){
        return "(" + x +")";
    }
}
