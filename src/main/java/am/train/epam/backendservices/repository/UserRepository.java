package am.train.epam.backendservices.repository;

import am.train.epam.backendservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
