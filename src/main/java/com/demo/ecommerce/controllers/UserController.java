package com.demo.ecommerce.controllers;

import com.demo.ecommerce.dto.users.SignInDto;
import com.demo.ecommerce.dto.users.SignInResponseDto;
import com.demo.ecommerce.dto.users.SignUpResponseDto;
import com.demo.ecommerce.dto.users.SignupDto;
import com.demo.ecommerce.exceptions.AuthenticationFailException;
import com.demo.ecommerce.exceptions.CustomException;
import com.demo.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signIn")
    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException, AuthenticationFailException {
        return userService.signIn(signInDto);
    }

}
