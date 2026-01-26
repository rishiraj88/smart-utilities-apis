package project.demo.application;

import jakarta.transaction.Transactional;
import project.demo.application.Interfaces.UserApplicationService;
import project.demo.domain.service.User.UserService;

public class UserApplicationServiceImpl implements UserApplicationService {

    private final UserService userService;

    public UserApplicationServiceImpl(UserService userApplicationService) {
        this.userService = userApplicationService;
    }

    @Override
    public String Login(String email, String password) {
      
        return userService.login(email, password);
    }

    @Transactional
    @Override
    public boolean Register(project.demo.domain.entities.User user, String password) {
        return userService.register(user, password);
    }

    @Transactional
    @Override
    public boolean ChangePassword(project.demo.domain.entities.User user, String newPassword) {
        return userService.changePassword(user, newPassword);
    }
}