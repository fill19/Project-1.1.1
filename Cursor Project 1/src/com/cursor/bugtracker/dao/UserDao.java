package com.cursor.bugtracker.dao;

import com.cursor.bugtracker.model.User;

import java.util.Map;

public interface UserDao {

    public Map<String, User> getAllUsers();


    User save(User userId);

    User getUserId(String userId);

    User deleteUserId(String userId);

    User saveName(User name);

    User getName(String name);

    User deletedName(String name);

    User savePassword(User password);

    User getPassword(int password);

    User deletedPassword(int password);


}
