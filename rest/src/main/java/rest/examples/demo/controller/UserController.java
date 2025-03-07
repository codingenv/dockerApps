package rest.examples.demo.controller;

import rest.examples.demo.entity.User;
import rest.examples.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        System.out.println("getAllUsers method invoked.");
        return userService.getAllUsers();
    }

    /*@GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        System.out.println("getUserByUsername method invoked.");
        return userService.getUserByUsername(username);
    }*/

    @GetMapping("/{id}")
    public User getUserByUserId(@PathVariable String id) {
        System.out.println("getUserByUsername method invoked.");
        Long idL = Long.valueOf(id);
        return userService.getUserByUserId(idL);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        System.out.println("createUser method invoked.");
        return userService.createUser(user);
    }
}
