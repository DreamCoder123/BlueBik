package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Account;
import com.app.Entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
	

}
