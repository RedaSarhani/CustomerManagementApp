package customermanagement.dao.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Table(name = "CUSTOMERS", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 20)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 20)
    private String lastName;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @Min(100)
    @Max(9999)
    private int score;

    @NotNull
    @Past
    private LocalDate dateOfBirth;
}
