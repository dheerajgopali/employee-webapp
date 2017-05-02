package com.dheeraj.learning.employeeapp.controller;

import com.dheeraj.learning.employeeapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by gopad on 30-04-2017.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/listUsers", method = RequestMethod.GET)
    public ModelAndView getAllUsers(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = null;

        List<String> users = userService.getAllUsers();
        mav = new ModelAndView("allusers");
        mav.addObject("users", users);

        return mav;
    }
}
