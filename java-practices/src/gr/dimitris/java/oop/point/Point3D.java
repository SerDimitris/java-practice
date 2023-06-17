package gr.dimitris.java.oop.point;

public final class Point3D extends Point2D {
    private int z;

    public Point3D(){}

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String converToString() {
        return super.converToString() + "(" + z + ")";
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }
}
