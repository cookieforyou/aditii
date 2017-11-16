package com.benz.aditii.service;

import com.benz.aditii.pojo.po.User;

public interface UserService {

    User checkUserLogin(User user);

    int save(User user);

    User findUserByName(User user);
}
