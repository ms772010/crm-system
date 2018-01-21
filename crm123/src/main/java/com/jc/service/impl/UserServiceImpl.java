package com.jc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jc.beans.User;
import com.jc.dao.IUserDao;
import com.jc.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        return this.userDao.selectById(userId);  
    }  
    public User getUserByName(String userName){
    	return this.userDao.selectByName(userName);
    }
  
} 