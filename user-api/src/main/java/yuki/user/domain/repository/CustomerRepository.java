package yuki.user.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yuki.user.domain.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
