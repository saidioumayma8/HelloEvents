package org.budgetmanager.helloevents.repository;

import org.budgetmanager.helloevents.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    Optional<User> findbyEmail(String email);
}
