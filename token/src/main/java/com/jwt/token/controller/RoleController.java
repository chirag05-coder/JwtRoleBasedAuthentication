package com.jwt.token.controller;

import com.jwt.token.entity.Role;
import com.jwt.token.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;
    @PostMapping("/createNewRole")
    public Role createNewRole(@RequestBody Role role) {
      return roleService.createNewRole(role);
    }
}
