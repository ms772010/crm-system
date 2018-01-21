package com.jc.service;

import com.jc.beans.User;

public interface IUserService {  
    public User getUserById(int userId);  
    public User getUserByName(String userName);
} 
