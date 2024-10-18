package org.aayush.fitnesstrackerappwithreact;

import org.aayush.fitnesstrackerappwithreact.model.AuthModel;
import org.aayush.fitnesstrackerappwithreact.model.UserDataModel;
import org.aayush.fitnesstrackerappwithreact.repo.UserRepo;
import org.aayush.fitnesstrackerappwithreact.service.MyUserDetailService;
import org.aayush.fitnesstrackerappwithreact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
@EnableMongoRepositories
public class FitnessTrackerAppWithReactApplication implements CommandLineRunner {

    @Autowired
    private final MyUserDetailService userDetailService;

    public FitnessTrackerAppWithReactApplication(MyUserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    public static void main(String[] args) {
        SpringApplication.run(FitnessTrackerAppWithReactApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        PasswordEncoder encoder = new BCryptPasswordEncoder();

    }
}
