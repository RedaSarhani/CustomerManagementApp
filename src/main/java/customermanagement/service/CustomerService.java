package customermanagement.service;

import customermanagement.dao.entities.Customer;
import customermanagement.dto.CreateCustomerRequest;
import customermanagement.dto.CustomerResponse;
import customermanagement.dto.UpdateCustomerRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface CustomerService {

    CustomerResponse getCustomerById(Long id);
    CustomerResponse createCustomer(CreateCustomerRequest request);
    CustomerResponse updateCustomer(Long id, UpdateCustomerRequest request);
    List<CustomerResponse> getAllCustomers();
    void deleteCustomer(Long id);
    UpdateCustomerRequest getUpdateCustomerRequest(Long id);
    Page<CustomerResponse> getCustomers(int page, int size);
}
