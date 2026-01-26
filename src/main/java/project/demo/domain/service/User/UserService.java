package project.demo.domain.service.User;

import org.apache.catalina.User;

public interface UserService {
 
    String Login(String email, String password);

    Void Register(User user,String password);
}
