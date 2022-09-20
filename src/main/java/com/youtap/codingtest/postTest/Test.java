package com.youtap.codingtest.postTest;

import com.youtap.codingtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by IntelliJ IDEA.
 * User: arnoldm
 * Email: arnoldmanyere@gmail.com
 * Phone: +263 779 056 314
 * Date: 2022-09-20
 * Time: 11:55
 */

@Component
public class Test {

    @Autowired
    private UserService userService;

    @PostConstruct
    void test(){
        userService.getUserContacts("Clemjjentine Bauch");
    }
}
