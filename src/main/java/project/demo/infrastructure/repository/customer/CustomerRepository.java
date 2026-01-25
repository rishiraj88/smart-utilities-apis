package project.demo.infrastructure.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import project.demo.domain.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    
}