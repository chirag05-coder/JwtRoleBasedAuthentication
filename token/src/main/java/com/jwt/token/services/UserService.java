package com.jwt.token.services;

import com.jwt.token.dao.UserDao;
import com.jwt.token.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(User user){
        String password = user.getUserPassword();
        user.setUserPassword(passwordEncoder.encode(password));
        return userDao.save(user);
    }
}
