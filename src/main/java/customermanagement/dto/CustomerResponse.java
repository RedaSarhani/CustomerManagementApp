package customermanagement.dto;

import lombok.Data;
import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;


public record CustomerResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        int score,
        LocalDate birthDate
) {}
