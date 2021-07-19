package pl.pawelkozlowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelkozlowski.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
