package org.example.Eagersingleton;

public class UserRepository {
 private Logger logger=Logger.getInstance();
    public String getuserById(int id)
    {
        // Simulating DB fetch
        if (id == 101) {
            return "Shivam Sharma";
        } else {
            logger.log("WARN", "User not found with ID: " + id);
            return null;
        }
    }
}
