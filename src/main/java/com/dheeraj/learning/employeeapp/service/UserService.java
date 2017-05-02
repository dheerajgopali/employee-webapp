package com.dheeraj.learning.employeeapp.service;

import com.dheeraj.learning.employeeapp.dto.Login;
import com.dheeraj.learning.employeeapp.dto.User;

import java.util.List;

/**
 * Created by gopad on 30-04-2017.
 */
public interface UserService {
    User validateUser(Login login);

    List<String> getAllUsers();
}
