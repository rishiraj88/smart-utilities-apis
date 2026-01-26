package project.demo.controller.dto;

public record UserChangePasswordDto(
    String firstName,
    String lastName,
    String email,
    String oldPassword,
    String newPassword
){}
