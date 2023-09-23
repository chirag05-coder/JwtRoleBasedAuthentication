package com.jwt.token.services;

import com.jwt.token.dao.RoleDao;
import com.jwt.token.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;
    public Role createNewRole(Role role) {

        return roleDao.save(role);
    }
}
