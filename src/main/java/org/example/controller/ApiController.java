package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/json*")
public class ApiController {

    private final UserService userService;

    @GetMapping("/{id}")
    public String giveMeUserJson(Model model, @PathVariable Long id){

        User user = userService.findById(id).orElseThrow();
        model.addAttribute("UserId", user.getId());
        model.addAttribute("Login", user.getLogin());
        model.addAttribute("Password", user.getPassword());

        // сходи по такшму=то адрес

        return "jsonMapper";
    }


}
