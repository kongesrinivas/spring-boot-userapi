package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get one user
    @GetMapping("/{id}")
    public User getUserById(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    // Update user
    @PutMapping("/{id}")
    public User updateUser(
            @PathVariable UUID id,
            @RequestBody User user) {
        return userService.updatedUser(id, user);
    }

    // Delete user
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable UUID id) {
        return userService.deleteUser(id);
    }
}