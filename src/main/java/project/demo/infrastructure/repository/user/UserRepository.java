package project.demo.infrastructure.repository.user;

import java.util.Optional;

// import org.apache.catalina.User;
import project.demo.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    //Optional to return Optinal.empty() if not found
    //IgnoreCase to ignore case sensitivity
    Optional<User> findByEmailIgnoreCase(String email);

    //Check if email exists
    boolean existsByEmailIgnoreCase(String email);
}

