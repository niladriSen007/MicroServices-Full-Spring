package com.niladri.accounts.microservices_account.mapper;

import com.niladri.accounts.microservices_account.dto.CustomerDto;
import com.niladri.accounts.microservices_account.entity.Customer;

public class CustomerMapper {
  
  public static CustomerDto mapToCustomerDto(Customer customer) {
    CustomerDto customerDto = new CustomerDto();
    customerDto.setEmail(customer.getCustomerEmail());
    customerDto.setName(customer.getCustomerName());
    customerDto.setMobileNumber(customer.getCustomerMobile());
    return customerDto;
  }

  public static Customer mapToCustomer(CustomerDto customerDto) {
    Customer customer = new Customer();
    customer.setCustomerEmail(customerDto.getEmail());
    customer.setCustomerName(customerDto.getName());
    customer.setCustomerMobile(customerDto.getMobileNumber());
    return customer;
  }
}
