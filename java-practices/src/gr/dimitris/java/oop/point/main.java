package gr.dimitris.java.oop.point;

public class main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        ((Point2D) p2).setY(5);
        p2.movePlusOne();
    }

    public static void doMovePlus10(Point point){
            point.movePlus10();
    }

}
