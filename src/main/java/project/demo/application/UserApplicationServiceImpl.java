package project.demo.application;

import project.demo.application.Interfaces.UserApplicationService;
import project.demo.domain.service.User.UserService;

public class UserApplicationServiceImpl implements UserApplicationService {

    private final UserService userService;

    public UserApplicationServiceImpl(UserService userApplicationService) {
        this.userService = userApplicationService;
    }

    @Override
    public String Login(String email, String password) {
      
        return userService.Login(email, password);
    }

    @Override
    public boolean Register(project.demo.domain.entities.User user, String password) {
        return userService.Register(user, password);
    }

    @Override
    public boolean ChangePassword(project.demo.domain.entities.User user, String newPassword) {
        return userService.ChangePassword(user, newPassword);
    }
}