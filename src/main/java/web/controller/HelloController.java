package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserService;
import web.service.UserServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    UserService userService = new UserServiceImp();

    @GetMapping(value = "/")
    public String showAllUsers(ModelMap model) {
        model.addAttribute("users", userService.listUsers());
        return "index";
    }
}