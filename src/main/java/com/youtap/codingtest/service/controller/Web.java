package com.youtap.codingtest.service.controller;

import com.youtap.codingtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: arnoldm
 * Email: arnoldmanyere@gmail.com
 * Phone: +263 779 056 314
 * Date: 2022-09-20
 * Time: 12:49
 */

@RestController
public class Web {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getusercontacts")
    Map getUserContacts(@RequestParam String parameter){
        return userService.getUserContacts(parameter);
    }
}
