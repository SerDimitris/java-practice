package gr.cf.user;

/**
 * Main class.
 */
public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Alice", "Borderland");
        UserCredentials userCredentials = new UserCredentials(1, "Alice2023", "qwerty");

        System.out.println("Id: " + userCredentials.getId());
        System.out.println("First name: " + user.getFirstname());
        System.out.println("Last name: " + user.getLastname());
        System.out.println("Username: " + userCredentials.getUsername());
        System.out.println("Password: " + userCredentials.getPassword());
    }
}
