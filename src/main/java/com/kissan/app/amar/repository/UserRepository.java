package com.kissan.app.amar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kissan.app.amar.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {}