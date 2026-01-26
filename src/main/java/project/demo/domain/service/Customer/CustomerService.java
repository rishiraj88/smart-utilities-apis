package project.demo.domain.service.Customer;

import java.util.List;

import project.demo.domain.entities.Customer;

public interface CustomerService {
    
    Customer createCustomer (Customer customer);
 
    Customer getCustomerById (Long id);
  
    List<Customer> getAllCustomers();

    boolean deleteCustomerById (Long id);

    Customer updateCustomer (Long id, Customer customer);
  
}
