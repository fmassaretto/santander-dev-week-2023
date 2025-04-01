package com.fabio.santander_dev_week_2023.service;

import com.fabio.santander_dev_week_2023.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
