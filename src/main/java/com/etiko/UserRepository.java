package com.etiko;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
	 Users findByUsername(String username);
}
