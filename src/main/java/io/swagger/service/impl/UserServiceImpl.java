package io.swagger.service.impl;

import io.swagger.entity.User;
import io.swagger.mapper.UserMapper;
import io.swagger.model.UsersBody;
import io.swagger.repository.UserRepository;
import io.swagger.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LogManager.getLogger();
    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(UsersBody usersBody){
        logger.info("Attempting to create new user");
        try{
            User userEntity = UserMapper.INSTANCE.toEntity(usersBody);
            userEntity = addUserFields(userEntity, usersBody);
            userRepository.save(userEntity);
            logger.info("Successfully created new user");
        } catch (Exception ex) {
            logger.error("Could not create new user");
            throw new RuntimeException("Could not create new user");
        }
    }

    private User addUserFields(User userEntity, UsersBody usersBody){
        //password hashing
        userEntity.setSalt("Salt");
        userEntity.setPassword("P");
        String userId = UUID.randomUUID().toString();
        userEntity.setUserId(userId);

        return userEntity;
    }
}
