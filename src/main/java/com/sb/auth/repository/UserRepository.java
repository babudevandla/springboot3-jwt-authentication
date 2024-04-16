package com.sb.auth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sb.auth.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
    Optional<User> findByEmail(String email);
}
