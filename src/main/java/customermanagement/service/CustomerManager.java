package customermanagement.service;

import customermanagement.dao.entities.Customer;
import customermanagement.dao.repositories.CustomerRepository;
import customermanagement.dto.CreateCustomerRequest;
import customermanagement.dto.CustomerResponse;
import customermanagement.dto.UpdateCustomerRequest;
import customermanagement.mappers.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerManager implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    // Get a Customer as UpdateCustomerRequest for the edit form
    public UpdateCustomerRequest getUpdateCustomerRequest(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer with id " + id + " not found"));
        return customerMapper.toUpdateRequest(customer);
    }

    @Override
    public Page<CustomerResponse> getCustomers(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Customer> customers = customerRepository.findAll(pageable);
        return customers.map(customerMapper::toResponse);
    }

    @Override
    public CustomerResponse getCustomerById(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer with id " + id + " not found"));
        return customerMapper.toResponse(customer);
    }

    @Override
    public CustomerResponse createCustomer(CreateCustomerRequest request) {
        Customer customer = customerMapper.toEntity(request);
        customerRepository.save(customer);
        return customerMapper.toResponse(customer);
    }

    @Override
    public CustomerResponse updateCustomer(Long id, UpdateCustomerRequest request) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer with id " + id + " not found"));
        customerMapper.updateCustomer(customer, request);
        customerRepository.save(customer);
        return customerMapper.toResponse(customer);
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::toResponse)
                .toList();
    }

    @Override
    public void deleteCustomer(Long id) {
        if(!customerRepository.existsById(id))
            throw new RuntimeException("Customer with id " + id + " not found");
        customerRepository.deleteById(id);
    }

    @Override
    public Page<CustomerResponse> searchCustomers(String keyword, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Customer> customers = customerRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(keyword, keyword, pageable);
        return customers.map(customerMapper::toResponse);
    }
}
