package com.youtap.codingtest.service.impl;

import com.youtap.codingtest.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
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
    public List<Map> getUsers() {
        try {
            logger.info("Getting all users.");
            Map[] response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Map[].class);
            return Arrays.asList(response);
        }catch (Exception ex){
            logger.severe("Failed to get Users.");
            return new ArrayList<>();
        }
    }

    //This method is for searching for a user with ID or Username.
    @Override
    public Map getUserContacts(String parameter) {
        logger.info("Get user contact details : " + parameter);
        Map contactDetail = new HashMap();
        try {
            List<Map> users = getUsers();
            Map userDetails = users.stream()
                    .filter(user -> (parameter.equals(user.get("id").toString()) || parameter.equals(user.get("name"))))
                    .findAny()
                    .orElse(null);

            contactDetail.put("id", userDetails.get("id").toString());
            contactDetail.put("email", userDetails.get("email").toString());
            contactDetail.put("phone", userDetails.get("phone").toString());
            return contactDetail;
        }catch (NullPointerException ex){
            contactDetail.put("id", "-1");
            return contactDetail;
        }
    }
}
