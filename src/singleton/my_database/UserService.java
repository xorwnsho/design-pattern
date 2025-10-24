package singleton.my_database;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    //가짜 인터페이스
    private List<User> userDatabase= new ArrayList<>();

    private Logger logger = Logger.getInstance();

    public void createUser(String username) {
        logger.log("UserService", "Attempting to create user: " + username);

        User newUser = new User(username);

        userDatabase.add(newUser);
        System.out.println("    ->(Logic) User added to DB: " + newUser.toString());

        logger.log("UserService", "SUCCESS: User'" + username + "' created. Total users: " + userDatabase.size());
    }
}
