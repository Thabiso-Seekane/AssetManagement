package com.AssetManagement.dao;

import com.AssetManagement.model.users.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    int addUser(User user);

    List<User> getAllUsers();

    User getUserById(UUID id);

    int updateUserById(UUID id, User updatedUser);

    int deleteUserById(UUID id);

    int getUserByEmployeeNumber(int employeeNumber);

    int updateUserByEmployeeNumber(int employeeNumber, User updatedUser);

    int deleteUserByEmployeeNumber(int employeeNumber);
}
