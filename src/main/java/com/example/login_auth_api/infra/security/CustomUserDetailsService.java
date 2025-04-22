package com.example.login_auth_api.infra.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    public UserDetails loadUserByUsername() throws UsernameNotFoundException {
        return null;
    }

}
