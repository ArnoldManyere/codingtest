package com.youtap.codingtest.service;

import com.youtap.codingtest.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: arnoldm
 * Email: arnoldmanyere@gmail.com
 * Phone: +263 779 056 314
 * Date: 2022-09-20
 * Time: 13:41
 */
class UserServiceTest {

    @Test
    void getUserContacts(){
        UserServiceImpl userService = new UserServiceImpl();
        Map map = new HashMap();
        map.put("id", "3");
        map.put("email", "Nathan@yesenia.net");
        map.put("phone", "1-463-123-4447");
        assertEquals(userService.getUserContacts("3"), map);
        assertEquals(userService.getUserContacts("Clementine Bauch"), map);

        map = new HashMap();
        map.put("id", "-1");
        assertEquals(userService.getUserContacts("jjfjadsjds"), map);
        assertEquals(userService.getUserContacts("100000000"), map);

    }


}