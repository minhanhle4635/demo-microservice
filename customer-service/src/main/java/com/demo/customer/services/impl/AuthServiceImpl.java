package com.demo.customer.services.impl;

import com.demo.customer.controllers.dto.request.CreateCustomerRequest;
import com.demo.customer.controllers.dto.request.LoginRequest;
import com.demo.customer.controllers.dto.response.AccountDetails;
import com.demo.customer.entities.AccountEntity;
import com.demo.customer.repositories.AccountRepository;
import com.demo.customer.services.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {
    private AccountRepository accountRepository;

    public AuthServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void registerCustomer(CreateCustomerRequest request) {
        AccountEntity entity = new AccountEntity();
        entity.setUsername("user3");
        entity.setPassword("123456");
        accountRepository.save(entity);
    }

    @Override
    public void login(LoginRequest request) {

    }

    @Override
    public void logout() {

    }

    @Override
    public List<AccountDetails> getAllAccount() {
        List<AccountEntity> entityList = accountRepository.findAll();
        return entityList.stream().map(item -> {
            return new AccountDetails(item.getUsername(), item.getPassword());
        }).collect(Collectors.toList());
    }
}
