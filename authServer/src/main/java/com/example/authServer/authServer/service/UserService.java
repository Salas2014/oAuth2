package com.example.authServer.authServer.service;

import com.example.authServer.authServer.entity.User;
import com.example.authServer.authServer.jpa.UserRepository;
import com.example.authServer.authServer.utils.CustomUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;
import java.util.logging.Logger;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    private Logger logger = Logger.getLogger(UserService.class.getName());

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException> s = () ->
                new UsernameNotFoundException("Problem during authentication");

        User u = userRepository.findByUsername(username).orElseThrow(s);

        return new CustomUserDetail(u);
    }
}
