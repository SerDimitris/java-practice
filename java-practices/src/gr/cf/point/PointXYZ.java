package gr.cf.point;

/**
 * {@link PointXYZ} represents <i>points</i> in a
 * 3D space, where <b>x</b>, <b>y</b> and <b>z</b>
 * coordinates are considered integers.
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    //Default constructor
    public PointXYZ(){}

    //Overloaded constructor
    public PointXYZ (int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getZ(){
        return z;
    }

    public void setZ(int z){
        this.z = z;
    }

    public String pointToString(){
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
