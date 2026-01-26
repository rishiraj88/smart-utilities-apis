package project.demo.controller.dto;

import java.time.LocalDate;

public record CustomerDto(
    Long id,
    String firstName,
    String lastName,
    String gender,
    LocalDate birthDate
) {}