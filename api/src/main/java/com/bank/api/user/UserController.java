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

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setUserName(userDTO.getUserName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setEmail(userDTO.getEmail());

        return new ResponseEntity(userService.register(userEntity), HttpStatus.OK);
    }


    @PostMapping("/registration")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> registration(@RequestBody UserRegistrationDTO regUserDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(regUserDTO.getSocialSecurity());
        userEntity.setUserName(regUserDTO.getUserName());
        userEntity.setLastName(regUserDTO.getPhoneNumber());
        userEntity.setPassword(regUserDTO.getPassword());
        userEntity.setEmail(regUserDTO.getEmail());

        return new ResponseEntity(userService.register(userEntity), HttpStatus.OK);
    }

}
