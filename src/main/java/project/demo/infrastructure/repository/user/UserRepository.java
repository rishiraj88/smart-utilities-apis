package project.demo.infrastructure.repository.user;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    //Optional to return null if not found
    //IgnoreCase to ignore case sensitivity
    Optional<User> findByEmailIgnoreCase(String email);

    //Check if email exists
    boolean existsByEmailIgnoreCase(String email);
}

