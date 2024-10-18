package org.aayush.fitnesstrackerappwithreact.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.aayush.fitnesstrackerappwithreact.model.AuthModel;
import org.aayush.fitnesstrackerappwithreact.repo.AuthUserRepo;
import org.aayush.fitnesstrackerappwithreact.service.MyUserDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    private final AuthUserRepo authUserRepo;
    private MyUserDetailService service;

    public Controller(AuthUserRepo authUserRepo, MyUserDetailService service) {
        this.authUserRepo = authUserRepo;
        this.service = service;
    }

    @GetMapping({"/hello", "/"})
    public String hello(HttpServletRequest request) {
        return "Hello World" + request.getSession().getId();
    }

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> createUser(@RequestBody AuthModel authModel) {

        if(service.findByUsername(authModel.getUsername())){
            return ResponseEntity.badRequest().body(Map.of("message", "User already exists"));
        }

        service.addUserAuthDetails(authModel.getUsername(), authModel.getPassword());
        return ResponseEntity.ok(Map.of("message", "User created"));
        }
    }

