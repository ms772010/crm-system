package com.jc.dao;

import org.apache.ibatis.annotations.Select;

import com.jc.beans.User;

public interface IUserDao {
    User selectById(Integer id);
    User selectByName(String userName);

}
