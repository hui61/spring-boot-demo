package com.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@RequiredArgsConstructor
public class UserService {
    @Resource
    private final UserRepository userRepository;

    public User getUser(Integer id) {
        return userRepository.getReferenceById(id);
    }
}
