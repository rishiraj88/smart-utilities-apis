package project.demo.application;

import project.demo.application.Interfaces.UserApplicationService;

public class UserApplicationServiceImpl implements UserApplicationService {

    private final UserApplicationService userApplicationService;

    public UserApplicationServiceImpl(UserApplicationService userApplicationService) {
        this.userApplicationService = userApplicationService;
    }

    @Override
    public String Login(String email, String password) {
        return userApplicationService.Login(email, password);
    }

    @Override
    public boolean Register(project.demo.domain.entities.User user, String password) {
        return userApplicationService.Register(user, password);
    }

    @Override
    public boolean ChangePassword(project.demo.domain.entities.User user, String newPassword) {
        return userApplicationService.ChangePassword(user, newPassword);
    }
}