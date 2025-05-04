package com.niladri.accounts.microservices_account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Schema(name = "Customer", description = "Schema to hold Customer and Account information")
@AllArgsConstructor
@ NoArgsConstructor
public class CustomerDto {

  @NotEmpty(message = "Name cannot be empty")
  @Schema(description = "Name of the Customer", example = "Niladri")
  @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
  private StringBuilder name;

  @NotEmpty(message = "Email cannot be empty")
  @Schema(description = "Email of the Customer", example = "abc@def.com")
  @Email(message = "Email should be valid")
  private StringBuilder email;

  @NotEmpty(message = "Mobile Number cannot be empty")
  @Schema(description = "Mobile Number of the Customer", example = "9876543210")
  @Size(min = 10, max = 12, message = "Mobile Number must be 10 digits")
  @Pattern(regexp = "(^$|\\d{10})", message = "Mobile Number must be 10 digits")
  private StringBuilder mobileNumber;

  @Schema(description = "Account of the Customer", example = "Savings")
  private AccountDto account;

}
