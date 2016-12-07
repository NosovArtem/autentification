package ru.nosov.autentification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nosov.autentification.model.User;

public interface UserDao extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
