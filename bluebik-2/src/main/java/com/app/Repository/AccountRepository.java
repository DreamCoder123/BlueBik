package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {

	List<Account> findByUsersUserId(Long userId);

}
