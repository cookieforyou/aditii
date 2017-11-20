package com.benz.aditii.service.impl;

import com.benz.aditii.common.util.IDUtils;
import com.benz.aditii.dao.TbUserMapper;
import com.benz.aditii.pojo.po.TbUser;
import com.benz.aditii.pojo.po.TbUserExample;
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
    private TbUserMapper userDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public TbUser checkUserLogin(TbUser user) {
        TbUser findUser = null;
        try {
            TbUserExample userExample = new TbUserExample();
            TbUserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUsernameEqualTo(user.getUsername());
            criteria.andPasswordEqualTo(user.getPassword());
            List<TbUser> users = userDao.selectByExample(userExample);
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
    public TbUser findUserByName(TbUser user) {
        TbUser findUser = null;
        try {
            TbUserExample userExample = new TbUserExample();
            TbUserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUsernameEqualTo(user.getUsername());
            List<TbUser> users = userDao.selectByExample(userExample);
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
    public int save(TbUser user) {
        int saveCount = 0;
        try {
            user.setId(IDUtils.getItemId());
            user.setCreated(new Date());
            user.setUpdated(new Date());
            saveCount = userDao.insert(user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return saveCount;
    }
}
