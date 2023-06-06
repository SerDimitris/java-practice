package gr.dimitris.java.oop;

/**
 * Eager instantiation
 * Mono-coding Factory Universe.
 * Singleton Pattern.
 */
public class CodingFactory {

    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory(){}

    public static CodingFactory getInstance(){
        return INSTANCE;
    }

    public void sayHello(){
        System.out.println("Hello Coding Factory");
    }
}
