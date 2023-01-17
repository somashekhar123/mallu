package com.flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.UserEntity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailId);


	

}
