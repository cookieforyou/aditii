package com.benz.aditii.service;

import com.benz.aditii.pojo.po.TbUser;

public interface UserService {

    TbUser checkUserLogin(TbUser user);

    int save(TbUser user);

    TbUser findUserByName(TbUser user);
}
