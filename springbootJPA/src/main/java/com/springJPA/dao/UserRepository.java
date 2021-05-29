package com.springJPA.dao;

import org.springframework.data.repository.CrudRepository;

import com.springJPA.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>
{



}
