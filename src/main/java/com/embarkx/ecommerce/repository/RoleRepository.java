package com.embarkx.ecommerce.repository;


import com.embarkx.ecommerce.model.AppRole;
import com.embarkx.ecommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(AppRole appRole);
}
