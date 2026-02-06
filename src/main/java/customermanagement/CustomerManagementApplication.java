package customermanagement;

import customermanagement.dao.entities.Customer;
import customermanagement.dao.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class CustomerManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagementApplication.class, args);
    }

    //@Bean
    public CommandLineRunner init(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null,"David", "Smith","david@gmail.com",212, LocalDate.of(1980, 1, 1)));
        };
    }
}
