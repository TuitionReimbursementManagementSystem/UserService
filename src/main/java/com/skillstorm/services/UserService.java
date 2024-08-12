package com.skillstorm.services;

import com.skillstorm.dtos.UserDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    // Register new User:
    Mono<UserDto> register(UserDto newUser);

    // Find User by Username:
    Mono<UserDto> findById(String username);

    // Find all Users:
    Flux<UserDto> findAll();

    // Update User by Username:
    Mono<UserDto> updateUserByUsername(String username, UserDto updatedUser);

    // Delete by Username:
    Mono<Void> deleteByUsername(String username);

    // Promote User to Department Head:
    Mono<UserDto> makeDepartmentHead(String username);

    // Promote User to Benefits Coordinator:
    Mono<UserDto> makeBenco(String username);
}
