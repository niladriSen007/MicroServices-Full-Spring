package com.niladri.accounts.microservices_account.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
  public ResourceNotFound(String resourceName, String fieldName, String fieldValue) {
    super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
  }
}
