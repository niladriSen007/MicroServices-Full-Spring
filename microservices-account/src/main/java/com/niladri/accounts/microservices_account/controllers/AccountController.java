package com.niladri.accounts.microservices_account.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.niladri.accounts.microservices_account.dto.CustomerDto;
import com.niladri.accounts.microservices_account.dto.ResponseDto;
import com.niladri.accounts.microservices_account.services.IAccountService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Tag(
  name = "Account Controller",
  description = "Account Controller Exposes REST APIs for Account"
)
@RestController
/* @RequestMapping("/") */
@Validated
@RequiredArgsConstructor
public class AccountController {
  private IAccountService accountService;

  public Mono<ResponseEntity<ResponseDto>> createAccount(@Valid @RequestBody CustomerDto customerDto) {
    accountService.createAccount(customerDto);
    return Mono.just(ResponseEntity.status(HttpStatus.CREATED).body(
      new ResponseDto("201", "Account Created Successfully")
    ));
  }
  
}
