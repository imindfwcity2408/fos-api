package com.aa.fos_api.controller;

import com.aa.fos_api.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "User", description = "APIs for accessing User Info")
public class UserController {
    @Autowired
    private UserService userService;
    @Operation(summary = "Fetch all users")
    @GetMapping ("/users")
    public List<String> getUserInfo(){
        return userService.getUserInfo();
    }


}
