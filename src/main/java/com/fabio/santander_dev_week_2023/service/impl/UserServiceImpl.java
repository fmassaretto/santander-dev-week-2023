package com.fabio.santander_dev_week_2023.service.impl;

import com.fabio.santander_dev_week_2023.domain.model.User;
import com.fabio.santander_dev_week_2023.repository.UserRepository;
import com.fabio.santander_dev_week_2023.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("user already exists");
        }
        return userRepository.save(user);
    }
}
