package net.veramendi.social_sb3_api.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.veramendi.social_sb3_api.exception.ResourceNotFoundException;
import net.veramendi.social_sb3_api.model.User;
import net.veramendi.social_sb3_api.repository.UserRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }
}
