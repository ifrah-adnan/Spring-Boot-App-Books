package com.adnan.springbootbookseller.security;

import com.adnan.springbootbookseller.models.User;
import com.adnan.springbootbookseller.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException(username));
        return null;
    }
}
