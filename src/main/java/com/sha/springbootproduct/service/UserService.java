package com.sha.springbootproduct.service;

import com.sha.springbootproduct.model.Role;
import com.sha.springbootproduct.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
