package com.fabio.santander_dev_week_2023.repository;

import com.fabio.santander_dev_week_2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
