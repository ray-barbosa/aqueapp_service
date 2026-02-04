package com.aqueapp.aqueapp_service.repository;


import com.aqueapp.aqueapp_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}
