package com.yapengren.bos.dao.system;

import com.yapengren.bos.domain.system.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
