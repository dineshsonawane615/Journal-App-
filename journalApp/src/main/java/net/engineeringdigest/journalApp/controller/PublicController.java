package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.Entry.User;
import net.engineeringdigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {
    @GetMapping("health-check")
    public String healthcare(){
        return "Ok";
    }

    @Autowired
    public UserService userService;

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user) {
        userService.saveNewUser(user);
    }

}
