package com.example.jspring_gdscbasic.controllers;

import com.example.jspring_gdscbasic.entities.User;
import com.example.jspring_gdscbasic.entities.UserContainer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String getAllUsers(){
        return "Ok";
    }

    @PutMapping()
    public User createUser(@RequestBody User user){
        return user;
    }

    @PostMapping("/{id}")
    public UserContainer testPost(@PathVariable UserContainer id, @RequestParam UserContainer serialNumber){
        final UserContainer userContainer = new UserContainer();
        /*IN NEED OF HELP :(((*/

        return userContainer;
    }



}
