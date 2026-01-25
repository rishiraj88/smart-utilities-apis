package project.demo.infrastructure.repository.ReadingRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.demo.domain.entities.Reading;

//Spring Data JPA repository 
public interface ReadingRepository extends JpaRepository<Reading, Long>
{
    List<Reading> findByCustomerId(Long customerId);
    
}
