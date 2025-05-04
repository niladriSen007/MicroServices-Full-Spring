package com.niladri.accounts.microservices_account.mapper;

import com.niladri.accounts.microservices_account.dto.AccountDto;
import com.niladri.accounts.microservices_account.entity.Account;

public class AccountMapper {
  

  private AccountMapper() {}
  public static AccountDto mapToAccountDto(Account account) {
    AccountDto accountDto = new AccountDto();
    accountDto.setAccountNumber(account.getAccountNumber());
    accountDto.setAccountType(account.getAccountType());
    accountDto.setBranchAddress(account.getBranchAddress());
    return accountDto;
  }

  public static Account mapToAccount(AccountDto accountDto) {
    Account account = new Account();
    account.setAccountNumber(accountDto.getAccountNumber());
    account.setAccountType(accountDto.getAccountType());
    account.setBranchAddress(accountDto.getBranchAddress());
    return account;
  }
}
