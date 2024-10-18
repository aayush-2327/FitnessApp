package org.aayush.fitnesstrackerappwithreact.service;

import org.aayush.fitnesstrackerappwithreact.model.UserDataModel;
import org.aayush.fitnesstrackerappwithreact.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private UserDataModel userDataModel;

    public void addUser(UserDataModel user) {
        repo.save(user);
    }

}
