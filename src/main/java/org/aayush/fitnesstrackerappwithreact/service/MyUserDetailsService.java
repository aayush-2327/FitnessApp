package org.aayush.fitnesstrackerappwithreact.service;

import org.aayush.fitnesstrackerappwithreact.model.UserDataModel;
import org.aayush.fitnesstrackerappwithreact.model.UserPrincipal;
import org.aayush.fitnesstrackerappwithreact.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDataModel user = userRepo.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException(username);
        }

        System.out.println("User found: " + user.getUsername());
        System.out.println("User password: " + user.getPassword());

        return new UserPrincipal(user);
    }
}
