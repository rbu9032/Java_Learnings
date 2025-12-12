package com.rbu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbu.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
