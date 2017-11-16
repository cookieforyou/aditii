package com.benz.aditii.service.impl;

import com.benz.aditii.common.util.IDUtils;
import com.benz.aditii.dao.UserMapper;
import com.benz.aditii.pojo.po.User;
import com.benz.aditii.pojo.po.UserExample;
import com.benz.aditii.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public User checkUserLogin(User user) {
        User findUser = null;
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUsernameEqualTo(user.getUsername());
            criteria.andPasswordEqualTo(user.getPassword());
            List<User> users = userDao.selectByExample(userExample);
            if (users != null && users.size() > 0) {
                findUser = users.get(0);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return findUser;
    }

    @Override
    public User findUserByName(User user) {
        User findUser = null;
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> users = userDao.selectByExample(userExample);
            if (users != null && users.size() > 0) {
                findUser = users.get(0);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return findUser;
    }

    @Override
    public int save(User user) {
        int saveCount = 0;
        try {
            user.setId(IDUtils.getItemId());
            user.setCreated(new Date());
            user.setUpdated(new Date());
            user.setStatus((byte) 0);
            saveCount = userDao.insert(user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return saveCount;
    }
}
