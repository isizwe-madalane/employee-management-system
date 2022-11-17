package com.isizwemadalane.springbootreactjs.repository;

import com.isizwemadalane.springbootreactjs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
