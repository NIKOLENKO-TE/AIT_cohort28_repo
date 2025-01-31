package lesson15.appExample.controllers;

import lesson15.appExample.DTO.UserDtoRequest;
import lesson15.appExample.DTO.UserDtoResponse;
import lesson15.appExample.core.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserControllers {
    private final UserServices service;

    @PostMapping("/")
    public UserDtoResponse addUser(@RequestBody UserDtoRequest userDto) {
        return service.createUser(userDto);
    }

    @GetMapping("/all")
    public List<UserDtoResponse> findAllUsers() {
        return service.findAllUsers();
    }

    @GetMapping("/")
    public UserDtoResponse findUserByEmail(@RequestParam String email) {
        return service.findUserByEmail(email);
    }
}
