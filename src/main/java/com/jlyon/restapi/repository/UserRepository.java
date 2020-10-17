package com.jlyon.restapi.repository;

import com.jlyon.restapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
	User findOneByEmail(String email);
}
