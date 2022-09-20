package com.youtap.codingtest.service;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: arnoldm
 * Email: arnoldmanyere@gmail.com
 * Phone: +263 779 056 314
 * Date: 2022-09-20
 * Time: 11:45
 */
public interface UserService {

    List<Map> getUsers();

    Map getUserContacts(String parameter);

}
