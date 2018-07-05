package com.hitachi.frm.api.repository;


import org.springframework.data.repository.CrudRepository;

import com.hitachi.frm.api.model.User;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByEmail(String email);

    User findOneByEmailAndPassword(String email, String password);
}
