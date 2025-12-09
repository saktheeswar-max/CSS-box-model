package com.example.demo.repository;

import com.example.demo.entity.UsersRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsersRolesRepository extends JpaRepository<UsersRoles, Long> {
    List<UsersRoles> findByUserId(Long userId);
}
