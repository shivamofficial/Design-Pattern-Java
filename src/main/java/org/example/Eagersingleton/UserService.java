package org.example.Eagersingleton;

public class UserService {
    private Logger logger = Logger.getInstance();

    private UserRepository userRepository = new UserRepository();

    public void processUser(int id) {
        logger.log("DEBUG", "Starting process for user: " + id);
        String user = userRepository.getuserById(id);

        if (user != null) {
            logger.log("INFO", "Processing completed for user: " + user);
        } else {
            logger.log("ERROR", "User process failed for ID: " + id);
        }
    }
}
