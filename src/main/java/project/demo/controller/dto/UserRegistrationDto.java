package project.demo.controller.dto;

public record UserRegistrationDto(
    String firstName,
    String lastName,
    String email,
    String password
) {}