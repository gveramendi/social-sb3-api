package net.veramendi.social_sb3_api.controller;

import lombok.AllArgsConstructor;

import net.veramendi.social_sb3_api.model.User;
import net.veramendi.social_sb3_api.security.CurrentUser;
import net.veramendi.social_sb3_api.security.UserPrincipal;
import net.veramendi.social_sb3_api.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/me")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return this.userService.getUserById(userPrincipal.getId());
    }
}
