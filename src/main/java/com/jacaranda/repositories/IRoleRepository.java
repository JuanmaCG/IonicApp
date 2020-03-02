package com.jacaranda.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacaranda.entities.Role;
import com.jacaranda.entities.RoleName;

public interface IRoleRepository extends JpaRepository<Role, Integer>{

	 Optional<Role> findByName(RoleName roleName);
}
