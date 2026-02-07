package customermanagement.web;

import customermanagement.CustomerManagementApplication;
import customermanagement.dao.entities.Customer;
import customermanagement.dto.CreateCustomerRequest;
import customermanagement.dto.CustomerResponse;
import customermanagement.dto.UpdateCustomerRequest;
import customermanagement.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/formCustomer")
    public String formCustomer(Model model) {
        model.addAttribute("customer", new CreateCustomerRequest());
        return "form-customer";
    }

    @PostMapping("/new")
    public String addCustomer(Model model,
                              @Valid @ModelAttribute("customer") CreateCustomerRequest customer,
                              BindingResult result ) {
        if (result.hasErrors()) {
            return "form-customer";
        }
        customerService.createCustomer( customer );
        return "redirect:/";
    }
    // MVC only accept Post/Get
    // Never Use Get for Deleting
    @PostMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam(name = "id") Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/";
    }

    @GetMapping("/editCustomer")
    public String updateCustomer(Model model, @RequestParam(name = "id") Long id) {
        UpdateCustomerRequest request = customerService.getUpdateCustomerRequest(id);
        model.addAttribute("customer", request);
        model.addAttribute("customerId", id);// only for POST URL or hidden input
        return "edit-customer";
    }

    @PostMapping("/saveEdit")
    public String updateCustomer(Model model,
                                 @RequestParam Long id,
                                 @Valid @ModelAttribute("customer") UpdateCustomerRequest request,
                                 BindingResult result) {
        if (result.hasErrors()) {
            return "edit-customer";
        }
        customerService.updateCustomer(id, request);
        return "redirect:/";
    }



}
