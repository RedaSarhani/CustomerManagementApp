package customermanagement.mappers;

import customermanagement.dao.entities.Customer;
import customermanagement.dto.CreateCustomerRequest;
import customermanagement.dto.CustomerResponse;
import customermanagement.dto.UpdateCustomerRequest;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toEntity(CreateCustomerRequest request){
        return new Customer(
                null,
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getScore(),
                request.getBirthDate()
        );
    }

    public CustomerResponse toResponse(Customer customer){
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getScore(),
                customer.getBirthDate()
        );
    }

    public void updateCustomer(Customer customer, UpdateCustomerRequest request){
        if(request.getFirstName() != null) customer.setFirstName(request.getFirstName());
        if(request.getLastName() != null) customer.setLastName(request.getLastName());
        if(request.getEmail() != null) customer.setEmail(request.getEmail());
        if(request.getScore() != null) customer.setScore(request.getScore());
        if(request.getBirthDate() != null) customer.setBirthDate(request.getBirthDate());

    }

    // converts entity to UpdateCustomerRequest for editing
    public UpdateCustomerRequest toUpdateRequest(Customer customer) {
        UpdateCustomerRequest request = new UpdateCustomerRequest();
        request.setFirstName(customer.getFirstName());
        request.setLastName(customer.getLastName());
        request.setEmail(customer.getEmail());
        request.setScore(customer.getScore());
        request.setBirthDate(customer.getBirthDate());
        return request;
    }
}
