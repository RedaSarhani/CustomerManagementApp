package customermanagement.web;

import customermanagement.dao.entities.Customer;
import customermanagement.dto.CustomerResponse;
import customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerWebController {

    private final CustomerService customerService;

    public CustomerWebController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public String showCustomer(Model model) {
        List<CustomerResponse> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "index";
    }


}
