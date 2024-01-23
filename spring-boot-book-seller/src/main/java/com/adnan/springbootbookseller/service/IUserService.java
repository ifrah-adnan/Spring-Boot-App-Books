package com.adnan.springbootbookseller.service;

import com.adnan.springbootbookseller.models.User;
import jakarta.transaction.Transactional;

import java.util.Optional;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);
}
