package gr.dimitris.java.oop.model;

public class UserCredentials {
    private int userCredentials;
    private String username;
    private String password;

    public UserCredentials(int userCredentials, String username, String password) {
        this.userCredentials = userCredentials;
        this.username = username;
        this.password = password;
    }

    public int getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(int userCredentials) {
        this.userCredentials = userCredentials;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
