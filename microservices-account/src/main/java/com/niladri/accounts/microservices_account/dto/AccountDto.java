package com.niladri.accounts.microservices_account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name = "Accounts", description = "Schema to hold Account information")
public class AccountDto {

  @NotEmpty(message = "Account Number cannot be empty")
  @Pattern(regexp = "(^$|\\d{10})", message = "AccountNumber must be 10 digits")
  @Schema(description = "Account Number of Bank account", example = "3454433243")
  private Long accountNumber;

  @NotEmpty(message = "Account Type cannot be empty")
  @Schema(description = "Account type of  Bank account", example = "Savings")
  private StringBuilder accountType;

  @NotEmpty(message = "Branch Address cannot be empty")
  @Schema(description = "Branch Address of  Bank account", example = "Kolkata")
  private StringBuilder branchAddress;
}
