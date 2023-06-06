package gr.dimitris.java.oop;

/**
 * Immutable Point
 */
public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(){
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
