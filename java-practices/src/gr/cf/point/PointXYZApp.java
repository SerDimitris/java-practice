package gr.cf.point;

/**
 * A class that prints the coordinates of a 3D point.
 */
public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(3, 44, 23);

        p1.setX(20);
        p1.setY(1);
        p1.setZ(39);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
    }
}
