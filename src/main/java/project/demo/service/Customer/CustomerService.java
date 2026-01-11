package project.demo.service.Customer;

import java.util.List;

import org.springframework.stereotype.Service;

import project.demo.model.Customer;
import project.demo.repository.CustomerRepository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Customer createCustomer (Customer customer) {

        Customer createdCustomer = customerRepository.save(customer);

        return createdCustomer;
    }  
    
    public Customer getCustomerById (Long id) {

        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
