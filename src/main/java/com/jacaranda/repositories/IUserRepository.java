package com.jacaranda.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacaranda.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String>{

    Optional<User> findByUsuario(String username);
    Boolean existsByUsuario(String username);
    Boolean existsByEmail(String email);
}
