package com.niladri.accounts.microservices_account.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.niladri.accounts.microservices_account.services.IAccountService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

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

  
}
