package com.niladri.accounts.microservices_account.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.niladri.accounts.microservices_account.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
  @Query("select c from t_customer t where t.customerEmail = ?1")
  Optional<Customer> findByCustomerEmail(StringBuilder email);
}
