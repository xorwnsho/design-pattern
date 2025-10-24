package singleton.my_database;

public class User {

    private static int idCounter = 1;
    private int id;
    private String username;

    public User(String username) {
        this.id = idCounter++;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User[ID=" + id + ", Name=" + username + "]";
    }
}
