package com.AssetManagement.api;

import com.AssetManagement.model.users.User;

import java.util.List;
import java.util.UUID;

import com.AssetManagement.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("asset/electronics")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "user")
    public void addUser(@RequestBody @Valid User user) {
        userService.addUser(user);
    }

    @GetMapping(path = "users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "user/{id}")
    public User getUserById(@PathVariable("id") UUID id) {
        return userService.getUserById(id);
    }

    @PutMapping(path = "user/{id}")
    public void updateUserById(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody User userUpdate) {
        userService.updateUserById(id, userUpdate);
    }

    @DeleteMapping(path = "/user/{id}")
    public void deleteUserById(@PathVariable("id") UUID id) {
        userService.deleteUserById(id);
    }
}

