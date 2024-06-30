package org.example.dao;

import org.example.model.User;
import org.example.util.Util;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser(User user) {
        Util.createSession(session -> session.save(user));
    }

    @Override
    public User getUserById(Long id) {
        List<User> array = new ArrayList<>();
        Util.createSession(session -> {
            User user1 = session.get(User.class, id);
            array.add(user1);
        });
        return array.get(0);
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

}
