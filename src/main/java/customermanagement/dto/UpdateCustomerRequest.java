package customermanagement.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor @Data
public class UpdateCustomerRequest {

    @Size(min = 2, max = 20)
    private String firstName;

    @Size(min = 2, max = 20)
    private String lastName;

    @Email
    private String email;

    @Min(100)
    private Integer score;

    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")  // Add this annotation
    private LocalDate birthDate;

}
