package com.niladri.accounts.microservices_account.services;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.niladri.accounts.microservices_account.dto.CustomerDto;
import com.niladri.accounts.microservices_account.entity.Account;
import com.niladri.accounts.microservices_account.entity.Customer;
import com.niladri.accounts.microservices_account.exception.CustomerAlreadyExists;
import com.niladri.accounts.microservices_account.mapper.CustomerMapper;
import com.niladri.accounts.microservices_account.repository.AccountRepository;
import com.niladri.accounts.microservices_account.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

  private final AccountRepository accountRepository;
  private final CustomerRepository customerRepository;

  @Override
  public Mono<String> createAccount(CustomerDto customerDto) {
    Customer customerDetails = CustomerMapper.mapToCustomer(customerDto);
    Optional<Customer> customer = customerRepository.findByCustomerEmail(customerDetails.getCustomerEmail());
    if (customer.isPresent()) {
      throw new CustomerAlreadyExists(
          "Customer already exists with given email - " + customerDetails.getCustomerEmail());
    }
    Customer savedCustomer = customerRepository.save(customerDetails);
    Account account = createNewAccount(savedCustomer);
    accountRepository.save(account);
    return Mono.just("Account Created");
  }


  private Account createNewAccount(Customer customer) {
    Account account = new Account();
    account.setCustomerId(customer.getCustomerId());
    Random random = new Random();
    account.setAccountNumber(1000000000L + random.nextLong(9000000000L));
    account.setAccountType(new StringBuilder("Savings"));
    account.setBranchAddress(new StringBuilder("Hyderabad"));
    return account;
  }
}
