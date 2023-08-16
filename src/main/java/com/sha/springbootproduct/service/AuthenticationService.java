package com.sha.springbootproduct.service;

import com.sha.springbootproduct.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
