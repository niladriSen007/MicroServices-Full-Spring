package com.niladri.accounts.microservices_account.services;

import com.niladri.accounts.microservices_account.dto.CustomerDto;

import reactor.core.publisher.Mono;

public interface IAccountService {
  Mono<String> createAccount(CustomerDto customerDto);
}
