package com.demo.user;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@NoArgsConstructor
public class UserService {
    @Resource
    private UserRepository userRepository;

    public User getUser(Integer id) {
        return userRepository.getReferenceById(id);
    }
}
