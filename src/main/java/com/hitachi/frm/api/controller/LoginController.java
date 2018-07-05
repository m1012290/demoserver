package com.hitachi.frm.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hitachi.frm.api.model.User;
import com.hitachi.frm.api.service.UserService;

@RestController
@RequestMapping("api")
public class LoginController {

    private final UserService userService;
    private final String errorresponsefor400   = "{\"status\":\"FAILURE\",\"message\":\"Invalid inputs recieved\"}";
    private final String errorresponsefor404 = "{\"status\":\"FAILURE\",\"message\":\"Email id or password is invalid\"}";
    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(
            value = "/login",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody User user) {
        if (StringUtils.isEmpty(user.getEmail()) || StringUtils.isEmpty(user.getPassword())) {
        	
            return new ResponseEntity<>(errorresponsefor400, HttpStatus.BAD_REQUEST);
        }
        if (userService.findUserByEmailAndPassword(user.getEmail(), user.getPassword()) == null){
            return new ResponseEntity<>(errorresponsefor404, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userService.findUserByEmail(user.getEmail()), HttpStatus.OK);
    }
}
