package org.aayush.fitnesstrackerappwithreact.service;

import org.aayush.fitnesstrackerappwithreact.model.AuthModel;
import org.aayush.fitnesstrackerappwithreact.model.UserPrincipal;
import org.aayush.fitnesstrackerappwithreact.repo.AuthUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private AuthUserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AuthModel user = repo.findByUsername(username);
        if(user == null) {
            System.out.println("User not found");
            throw new UsernameNotFoundException(username);
        }

        System.out.println(user.toString());
        return new UserPrincipal(user);
    }

    public boolean findByUsername(String username) {
        return repo.findByUsername(username) != null;
    }

    public void addUserAuthDetails(String username, String password) {
        if(username == null) {
            throw new IllegalArgumentException("Details cannot be null");
        }
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        repo.save(new AuthModel(username, encoder.encode(password)));
    }

}
