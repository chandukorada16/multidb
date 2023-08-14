package com.multiDB.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiDB.user.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{


}
