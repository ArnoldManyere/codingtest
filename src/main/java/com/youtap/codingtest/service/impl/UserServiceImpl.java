package com.youtap.codingtest.service.impl;

import com.youtap.codingtest.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: arnoldm
 * Email: arnoldmanyere@gmail.com
 * Phone: +263 779 056 314
 * Date: 2022-09-20
 * Time: 11:45
 */

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    private RestTemplate restTemplate = new RestTemplate();

    //This method returns a list of users from the Third Party API.
    @Override
    public List<Map> getUsers() {
        logger.info("Getting all users.");
        Map[] response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Map[].class);
        return Arrays.asList(response);
    }
}
