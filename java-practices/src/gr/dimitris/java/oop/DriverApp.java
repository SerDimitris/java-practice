package gr.dimitris.java.oop;

public class DriverApp {

    public static void main(String[] args) {
        Teacher alice = new Teacher();

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println(alice.getId());
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());
    }
}
