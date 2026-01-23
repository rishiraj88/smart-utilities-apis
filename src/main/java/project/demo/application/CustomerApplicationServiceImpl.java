package project.demo.application;

import project.demo.application.Interfaces.CustomerApplicationService;
import project.demo.model.Customer;
import project.demo.service.Customer.CustomerService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerApplicationServiceImpl implements CustomerApplicationService {

    private final CustomerService customerService;

    public CustomerApplicationServiceImpl(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerService.createCustomer(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerService.getCustomerById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @Override
    public void deleleteCustomerById(Long id) {
        customerService.deleleteCustomerById(id);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return customerService.updateCustomer(id, customer);
    }
}