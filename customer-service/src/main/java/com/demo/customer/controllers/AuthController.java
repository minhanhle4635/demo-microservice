package com.demo.customer.controllers;

import com.demo.customer.controllers.dto.request.CreateCustomerRequest;
import com.demo.customer.controllers.dto.request.LoginRequest;
import com.demo.customer.controllers.dto.response.AccountDetails;
import com.demo.customer.services.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping
    public void register(@RequestBody CreateCustomerRequest request){
        authService.registerCustomer(request);
    }

    @GetMapping
    public List<AccountDetails> getAccountDetails(){
        return authService.getAllAccount();
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest request) {
        authService.login(request);
    }

    @DeleteMapping
    public void logout(){
        authService.logout();
    }
}
