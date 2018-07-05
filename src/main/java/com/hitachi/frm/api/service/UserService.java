package com.hitachi.frm.api.service;



import java.util.List;
import java.util.Optional;

import com.hitachi.frm.api.model.User;

public interface UserService {
    List<User> getUsers();

    Optional<User> getUser(Long id);

    User createUser(User user);

    User findUserByEmail(String email);

    User findUserByEmailAndPassword(String email, String password);
}
