package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsersController {
    private final UserService userService;
    private final List<User> userList;

    public UsersController(UserService userService) {
        this.userService = userService;
        this.userList = userService.findAll();
    }

    @GetMapping("/users")
    public String main(Model model) {
        model.addAttribute("message", "Users List From DB:");
        model.addAttribute("users", userList);
        return "users";
    }
}
