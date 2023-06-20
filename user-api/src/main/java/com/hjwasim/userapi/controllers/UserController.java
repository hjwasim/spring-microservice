package com.hjwasim.userapi.controllers;

import com.hjwasim.userapi.dtos.UserDTO;
import com.hjwasim.userapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<UserDTO> getUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/user/{id}")
    UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    UserDTO newUser(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @GetMapping("/user/pan/{pan}")
    UserDTO findByPan(@PathVariable String pan) {
        return userService.findByPan(pan);
    }

    @DeleteMapping("/user/{id}")
    UserDTO delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @GetMapping("/user/search")
    public List<UserDTO> queryByName(@RequestParam(name = "name", required = true) String name) {
        return userService.queryByName(name);
    }

}
