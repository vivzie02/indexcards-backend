package io.swagger.service;

import io.swagger.model.User;
import io.swagger.model.UsersBody;
import org.springframework.stereotype.Service;

public interface UserService {
    void createUser(UsersBody usersBody);
}
