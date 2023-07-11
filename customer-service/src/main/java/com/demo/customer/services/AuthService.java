package com.demo.customer.services;

import com.demo.customer.controllers.dto.request.CreateCustomerRequest;
import com.demo.customer.controllers.dto.request.LoginRequest;
import com.demo.customer.controllers.dto.response.AccountDetails;

import java.util.List;

public interface AuthService {

    void registerCustomer(CreateCustomerRequest request);

    void login(LoginRequest request);

    void logout();

    List<AccountDetails> getAllAccount();
}
