package com.dheeraj.learning.employeeapp.service;

import com.dheeraj.learning.employeeapp.dto.Login;
import com.dheeraj.learning.employeeapp.dto.User;
import org.springframework.stereotype.Service;

/**
 * Created by gopad on 30-04-2017.
 */
@Service
public class UserServiceImpl {

    public User validateUser(Login login){
        return new User();
    }
}
