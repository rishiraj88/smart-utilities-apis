package project.demo.domain.service.User;

import project.demo.domain.entities.User;
public interface UserService {
 
    String login(String email, String password);

    boolean register(User user, String password);

    boolean changePassword(User user, String newPassword);
}
