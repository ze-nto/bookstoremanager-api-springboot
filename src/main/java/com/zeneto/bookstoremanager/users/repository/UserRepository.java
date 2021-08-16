package com.zeneto.bookstoremanager.users.repository;

import com.zeneto.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
