package com.skillstorm.services;

import com.skillstorm.dtos.UserDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    // Register new User:
    Mono<UserDto> register(UserDto newUser);

    // Find User by Username:
    Mono<UserDto> findByUsername(String username);

    // Find all Users:
    Flux<UserDto> findAll();

    // Update User by Username:
    Mono<UserDto> updateUserByUsername(String username, UserDto updatedUser);

    // Delete by Username:
    Mono<Void> deleteByUsername(String username);

    // Get Supervisor:
    Mono<String> findSupervisorByEmployeeUsername(String employeeUsername);

    // Get Department Head:
    Mono<String> findDepartmentHeadByEmployeeUsername(String employeeUsername);
}
