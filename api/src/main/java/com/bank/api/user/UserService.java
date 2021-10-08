package com.bank.api.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
