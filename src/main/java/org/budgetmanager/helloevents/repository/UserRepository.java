package org.budgetmanager.helloevents.repository;

import org.budgetmanager.helloevents.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email); // Use 'email' if that is the correct field for login
}