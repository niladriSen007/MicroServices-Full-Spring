package com.niladri.accounts.microservices_account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niladri.accounts.microservices_account.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
  
}
