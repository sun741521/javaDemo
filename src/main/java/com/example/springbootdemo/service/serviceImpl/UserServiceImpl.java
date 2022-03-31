package com.example.springbootdemo.service.serviceImpl;

import com.example.springbootdemo.bean.UserBean;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    User

    @Override
    public UserBean logIn(String name, String password) {

        return null;
    }
}
