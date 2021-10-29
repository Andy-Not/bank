package com.bank.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> registration(@RequestBody UserRegistrationDTO userRegDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userRegDTO.getFirstName());
        userEntity.setLastName(userRegDTO.getLastName());
        userEntity.setUserName(userRegDTO.getUserName());
        userEntity.setPassword(userRegDTO.getPassword());
        userEntity.setEmail(userRegDTO.getEmail());
        userEntity.setSocialSecurity(userRegDTO.getSocialSecurity());
        userEntity.setPhoneNumber(userRegDTO.getPhoneNumber());
        return new ResponseEntity(userService.registerUser(userEntity), HttpStatus.OK);
    }

    @GetMapping("/getUserByUsername")
    public ResponseEntity<UserEntity> getUserByUsername(@RequestBody UserRegistrationDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userDTO.getUserName());

        return new ResponseEntity(userService.getUserByUsername(userEntity),HttpStatus.OK);
    }

    @DeleteMapping("/deleteUserByUsername")
    public ResponseEntity<String> deleteUserByUsername(@RequestBody UserRegistrationDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userDTO.getUserName());

        return new ResponseEntity(userService.deleteUserByUsername(userEntity), HttpStatus.OK);
    }

}
