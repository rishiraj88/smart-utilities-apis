package project.demo.domain.service.User;

import org.apache.catalina.User;

import project.demo.infrastructure.repository.user.UserRepository;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }   

    @Override
    public String Login(String email, String password) {
        // Implementation of login logic
        return "User logged in with email: " + email;
    }

    @Override
    public void Register(User user, String password) {
        

        return;
    }
    

    private String CreatePassword( byte[] hashPassword, byte[] saltPassword, String password){
        // Implementation of password creation logic
        return "hashed_" + password;
    }

    private String GenerateToken(String email, String name){
        // Implementation of token generation logic
        return "token_for_" + email;
    }
}
