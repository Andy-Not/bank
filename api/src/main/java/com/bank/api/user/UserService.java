package com.bank.api.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String register(UserEntity user) {
        if (user != null) {
            userRepository.save(user);
            logger.debug(user.getUserName() + "is registered");
            return "success";
        }
        return "failed";
    }

    public UserEntity getUserByUsername(UserEntity userEntity) {
        return userRepository.findById(userEntity.getUserName()).get();
    }

    public String deleteUserByUsername(UserEntity userEntity) {
        try {
            userRepository.deleteById(userEntity.getUserName());
            return userEntity.getUserName() + " is deleted successfully";
        } catch (EmptyResultDataAccessException e) {
            return userEntity.getUserName() + " does not exist";
        }
    }
}
