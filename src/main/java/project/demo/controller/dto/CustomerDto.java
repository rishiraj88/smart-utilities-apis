package project.demo.controller.dto;

import java.time.LocalDate;

public record CustomerDto(
    Long id,
    String firsName,
    String lastName,
    String gender,
    LocalDate birthDate
) {}