package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getInfo(User user) throws Exception{
        return userMapper.getInfo(user);
    }
}
