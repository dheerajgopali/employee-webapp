package com.dheeraj.learning.employeeapp.service.impl;

import com.dheeraj.learning.employeeapp.dao.UserDao;
import com.dheeraj.learning.employeeapp.dto.Login;
import com.dheeraj.learning.employeeapp.dto.User;
import com.dheeraj.learning.employeeapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gopad on 30-04-2017.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public User validateUser(Login login){
        return new User();
    }

    public List<String> getAllUsers(){
        return userDao.getAllUsers();
    }
}
