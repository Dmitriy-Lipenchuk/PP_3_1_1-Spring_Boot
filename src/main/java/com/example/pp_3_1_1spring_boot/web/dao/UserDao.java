package com.example.pp_3_1_1spring_boot.web.dao;

import com.example.pp_3_1_1spring_boot.web.models.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void removeUser(int id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUser(int id);
}
