package com.AssetManagement.service.userservice;

import com.AssetManagement.dao.UserRepository;
import com.AssetManagement.model.users.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements  UserService{

    private UserRepository userRepository;

    @Override
    public int addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserById(UUID id) {
        return userRepository.getUserById(id);
    }

    @Override
    public int updateUserById(UUID id, User updatedUser) {
        return userRepository.updateUserById(id, updatedUser);
    }

    @Override
    public int deleteUserById(UUID id) {
        return userRepository.deleteUserById(id);
    }

    @Override
    public int getUserByEmployeeNumber(int employeeNumber) {
        return userRepository.getUserByEmployeeNumber(employeeNumber);
    }

    @Override
    public int updateUserByEmployeeNumber(int employeeNumber, User updatedUser) {
        return userRepository.updateUserByEmployeeNumber(employeeNumber, updatedUser);
    }

    @Override
    public int deleteUserByEmployeeNumber(int employeeNumber) {
        return userRepository.deleteUserByEmployeeNumber(employeeNumber);
    }
}
