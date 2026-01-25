package project.demo.application;

import project.demo.application.Interfaces.CustomerApplicationService;
import project.demo.model.Customer;
import project.demo.service.Customer.CustomerService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerApplicationServiceImpl implements CustomerApplicationService {

    private final CustomerService customerService;

    public CustomerApplicationServiceImpl(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @Transactional
    @Override
    public Customer createCustomer(Customer customer) {
        return customerService.createCustomer(customer);
    }

    @Transactional(readOnly = true)
    @Override
    public Customer getCustomerById(Long id) {
        return customerService.getCustomerById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @Transactional
    @Override
    public void deleleteCustomerById(Long id) {
        customerService.deleleteCustomerById(id);
    }

    @Transactional
    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return customerService.updateCustomer(id, customer);
    }
}